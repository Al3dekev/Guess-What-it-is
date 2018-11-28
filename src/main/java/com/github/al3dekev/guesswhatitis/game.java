package com.github.al3dekev.guesswhatitis;

import java.util.Scanner;

public class game {

    int turnNumber;
    Scanner lire = new Scanner(System.in);
    player player = new player();
    master NPC = new master();

    public game(int diff){

        if(diff == 1){ // easy
            setTurnNumber(20);
        } else if (diff == 2){ // normal
            setTurnNumber(10);
        } else{ // hard
            setTurnNumber(5);
        }

    }


    public void createEntities(){


        //player
        System.out.println("Choisir votre nom: ");
        player.setName(lire.nextLine());

        //NPC
        NPC.setName("NPC");
        NPC.setStick(Math.random());


    }

    public void turn() {

        NPC.introAlert();
        if() {
            while (player.getStick() != NPC.getStick()) {
                this.setTurnNumber(getTurnNumber()-1);
                System.out.println("Tour restants: " + getTurnNumber());
                if (getTurnNumber() == 0) {
                    NPC.outroAlert();
                    break;
                } // if
            } // while
        } else{

        }
    } // method


    public int getTurnNumber() {
        return turnNumber;
    }


    public void setTurnNumber(int turnNumber) {
        this.turnNumber = turnNumber;
    }


}
