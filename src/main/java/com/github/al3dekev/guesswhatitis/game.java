package com.github.al3dekev.guesswhatitis;

import java.util.Scanner;

public class game {

    int turnNumber;
    int lower;
    int higher;
    Scanner lire = new Scanner(System.in);
    player player = new player();
    master NPC = new master();

    public game(int diff){

        this.setLower(1);
        this.setHigher(100);

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
        System.out.println("Choose you name: ");
        player.setName(lire.nextLine());

        //NPC
        NPC.setName("NPC");
        int r = (int) (Math.random() * (this.getLower() - this.getHigher())) + this.getHigher();
        //System.out.println(r); used to know the choosen number of NPC
        NPC.setStick(r);


    }

    public void turn() {

        int x;
        NPC.introAlert();

            for(x = 0; x<this.getTurnNumber(); x++){
                choiceAndTurnAlert(x);

                if(player.getStick() == NPC.getStick()){
                    NPC.goodChoiceAlert();
                    NPC.outroAlert();
                    break;
                }else{
                    NPC.wrongChoiceAlert();
                    closeRangeChoiceAlert();
                }
            }


        if (getTurnNumber() == x) {
            this.loseAlert();
        } else{
            this.winAlert();
        }


    } // method

    public void choiceAndTurnAlert(int x){
        System.out.println("left Turns: " + (getTurnNumber()-x));
        System.out.println("Please, choose a number:");
        do {
            player.setStick(lire.nextInt());
        }while(player.getStick() < this.getLower() || player.getStick() > this.getHigher());
    }

    public void closeRangeChoiceAlert(){
        if(NPC.getStick() < player.getStick()){
            System.out.println("You're too HIGH");
        } else if(NPC.getStick() > player.getStick()){
            System.out.println("You're too LOW");
        } else{
            // nothing
        }
    }

    public void winAlert(){
        System.out.println("Congrats, you won !");
    }

    public void loseAlert(){
        System.out.println("You lose.");
    }


    public int getTurnNumber() {
        return turnNumber;
    }

    public int getLower() {
        return lower;
    }

    public int getHigher() {
        return higher;
    }

    public void setTurnNumber(int turnNumber) {
        this.turnNumber = turnNumber;
    }

    public void setHigher(int higher) {
        this.higher = higher;
    }

    public void setLower(int lower) {
        this.lower = lower;
    }
}
