package com.github.al3dekev.guesswhatitis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class initializer {

    public String gameName;
    public int difficulty;
    public Scanner lire = new Scanner(System.in);

    /**
     * Constructeur
     */
    public initializer(String gamename){
        setGameName(gamename);
    }


    /**
     * Firstly placed as a beginning
     *
     */
    public void openGameAlert(){
        System.out.println("Welcome in "+getGameName());
        System.out.println("an Infogrames game");
        System.out.println("Please, select your game difficulty:");
        System.out.println("1:Easy\n2:Normal\n3:Hard");

        do {
            try {
                do {
                    setDifficulty(lire.nextInt());
                }while(getDifficulty() < 1 || getDifficulty() > 2);
                System.out.println("You've choosen the "+convertDifficulty()+" difficulty");
            } catch (InputMismatchException e) {
                System.out.println("Please, enter a number");
                this.lire = new Scanner(System.in);
            }
        } while(getDifficulty() < 1 || getDifficulty() > 2);
        this.openGame();


        /*do {
            setDifficulty(lire.nextInt());
        }while(getDifficulty() < 1 || getDifficulty() > 2);
        System.out.println("You've choosen the "+convertDifficulty()+" difficulty");
        this.openGame();*/
    } // OpenGameAlert - end

    /**
     * This is the second element
     */
    public void openGame(){
        //instantiate the game with entities inside of it
        game gameTurnedOn = new game(getDifficulty());
        gameTurnedOn.createEntities();
        gameTurnedOn.turn();


    }

    public void closeGame(){
        System.exit(0);
    }

    public String convertDifficulty(){
        if(this.difficulty == 1){
            return "Easy";
        } else if(this.difficulty == 2){
            return "Normal";
        } else{
            return "Hard";
        }
    }



    /*******GET/SET*******/

    /**
     *
     * @return
     */
    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
        }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }


}


