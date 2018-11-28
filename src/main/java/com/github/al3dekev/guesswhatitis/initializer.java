package com.github.al3dekev.guesswhatitis;

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
        System.out.println("Welcome "+getGameName());
        System.out.println("an Infogrames game");
        System.out.println("Please, select your game difficulty:");
        System.out.println("1:Easy\b2:Normal\b3:Hard");
        do {
            setDifficulty(lire.nextInt());
        }while(getDifficulty() < 1 || getDifficulty() > 2);
        System.out.println("You've choosen the "+convertDifficulty()+" difficulty");
        this.openGame();
    }

    /**
     * This is the second element
     */
    public void openGame(){
        //instantiate the game
        game gameTurnedOn = new game(getDifficulty());

        //now the player & bot
        master NPC = new master("NPC",Math.random());


    }

    public void closeGame(){

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


