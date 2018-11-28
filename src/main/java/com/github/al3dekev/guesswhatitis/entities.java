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
        this.choosingAStickAlert();
    }
}
