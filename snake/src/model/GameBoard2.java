package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameBoard2 {
    private Dice dice;
    private List<Player> allPlayers;
    private Map<Integer, Integer> snakes;
    private Map<Integer, Integer> ladders;
    private Map<String, Integer> playersCurrentPosition;
    private int boardSize;
    private final List<BoardCell> cells = new ArrayList<>();
    public GameBoard2(Dice dice, List<Player> allPlayers,Map<Integer, Integer>snakes, Map<Integer, Integer> ladders, Map<String, Integer> playersCurrentPosition, int boardSize) {
        this.dice=dice;
        this.allPlayers=allPlayers;
        this.snakes=snakes;
        this.ladders=ladders;
        this.playersCurrentPosition=playersCurrentPosition;
        this.boardSize=boardSize;
        for(int i=1;i<=boardSize;i++){
                cells.add(BoardCellFactory.create(i, snakes,ladders));
        }
    }

    public void startGame(){
        boolean someOneWon=false;
        Integer currentPlayerIndex=0;
        while(!someOneWon){
            Player currectPlayer=allPlayers.get(currentPlayerIndex);
            Integer currentPlace=playersCurrentPosition.get(currectPlayer.getName());
            Integer getNextRollsValue=dice.rollDice();
            Integer tentaive=currentPlace+getNextRollsValue;
            if(tentaive==boardSize){
                playersCurrentPosition.put(currectPlayer.getName(),currentPlace+getNextRollsValue);
                System.out.println(currectPlayer.getName() + " won \n");
                someOneWon=true;
            }else if(currentPlace+getNextRollsValue>boardSize){
                continue;
            }else if(currentPlace+getNextRollsValue<boardSize){
                playersCurrentPosition.put(currectPlayer.getName(),cells.get(tentaive).getEnd());
            }
            System.out.println(currectPlayer.getName()+ " "+playersCurrentPosition.get(currectPlayer.getName()));
            currentPlayerIndex=(currentPlayerIndex+1)%allPlayers.size();
        }
    }
}
