package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameBoard {
    private Dice dice;
    private List<Player> allPlayers;
    private List<Jumper> snakes;
    private List<Jumper> ladders;
    private Map<String, Integer> playersCurrentPosition;
    private int boardSize;
    public GameBoard(Dice dice, List<Player> allPlayers, List<Jumper> snakes, List<Jumper> ladders, Map<String, Integer> playersCurrentPosition, int boardSize) {
        this.dice=dice;
        this.allPlayers=allPlayers;
        this.snakes=snakes;
        this.ladders=ladders;
        this.playersCurrentPosition=playersCurrentPosition;
        this.boardSize=boardSize;
    }
    public void startGame(){
        boolean someOneWon=false;
        Integer currentPlayerIndex=0;
        Map<Integer,Integer>sn= new HashMap<>();
        for (int i=0;i<snakes.size();i++){
            sn.put(snakes.get(i).getStart(),snakes.get(i).getEnd());
        }
        Map<Integer,Integer>ld= new HashMap<>();
        for (int i=0;i<ladders.size();i++){
            ld.put(ladders.get(i).getStart(),ladders.get(i).getEnd());
        }
        while(!someOneWon){
            Player currectPlayer=allPlayers.get(currentPlayerIndex);
            Integer currentPlace=playersCurrentPosition.get(currectPlayer.getName());
            Integer getNextRollsValue=dice.rollDice();
            if(currentPlace+getNextRollsValue==boardSize){
                playersCurrentPosition.put(currectPlayer.getName(),currentPlace+getNextRollsValue);
                System.out.println(currectPlayer.getName() + " won \n");
                someOneWon=true;
            }else if(sn.containsKey(currentPlace+getNextRollsValue)){
                playersCurrentPosition.put(currectPlayer.getName(),sn.get(currentPlace+getNextRollsValue));
            }
            else if(ld.containsKey(currentPlace+getNextRollsValue)){
                playersCurrentPosition.put(currectPlayer.getName(),ld.get(currentPlace+getNextRollsValue));
            }else if(currentPlace+getNextRollsValue<boardSize){
                playersCurrentPosition.put(currectPlayer.getName(),currentPlace+getNextRollsValue);
            }
            System.out.println(currectPlayer.getName()+ " "+playersCurrentPosition.get(currectPlayer.getName()));
            currentPlayerIndex=(currentPlayerIndex+1)%allPlayers.size();
        }
    }
}
