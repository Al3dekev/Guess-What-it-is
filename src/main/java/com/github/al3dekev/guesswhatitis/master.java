package com.github.al3dekev.guesswhatitis;

public class master extends entities{



    public void wrongChoiceAlert(){
        System.out.println(this.getName()+": you did the wrong choice, Billy");
    }

    public void goodChoiceAlert(){
        System.out.print(this.getName()+": That was a good choice !");
    }

    public void introAlert(){
        System.out.println(this.getName()+": Welcome to the game, Billy! you'll never know what's my choose number !");
    }

    public void outroAlert(){
        System.out.println(this.getName()+": Good job Billy, you won !");
    }





}
