package model;

public class Dice {
    private int numberOfDice;
    public Dice(int numberOfDice){
        this.numberOfDice=numberOfDice;
    }
    public int rollDice(){
        int val=0;
        for(int i=0;i<numberOfDice;i++){
            val+=(int)((Math.random()*6)%6)+1;
        }
        return val;
    }
}
