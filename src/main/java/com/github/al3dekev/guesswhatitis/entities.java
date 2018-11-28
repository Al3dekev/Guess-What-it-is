package com.github.al3dekev.guesswhatitis;

public class entities {

    String name;
    int stick;

    public void choosingAStickAlert(){
        System.out.println(this.getName()+" has choose a stick.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStick() {
        return stick;
    }

    public void setStick(int stick) {
        this.stick = stick;
        if(stick < 1 || stick > 100){
            System.out.println("Err: Stick of "+this.getName()+" less than 0 or more than 100, try again");
        } else{
            this.choosingAStickAlert();
        }

    }
}
