import model.Dice;
import model.GameBoard;
import model.Jumper;
import model.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Dice dice=new Dice(1);
        Player player1=new Player("1","Debo");
        Player player2=new Player("2","Anish");
        List<Player>allPlayers=new ArrayList<>();
        allPlayers.add(player1);
        allPlayers.add(player2);
        Jumper snake1=new Jumper(50,10);
        Jumper snake2=new Jumper(30,15);
        Jumper ladder1=new Jumper(5,45);
        Jumper ladder2=new Jumper(55,80);
        List<Jumper>snakes = new ArrayList<>();
        List<Jumper>ladders = new ArrayList<>();
        snakes.add(snake1);
        snakes.add(snake2);
        ladders.add(ladder1);
        ladders.add(ladder2);
        Map<String, Integer>playersCurrentPosition = new HashMap<>();
        playersCurrentPosition.put("Debo",0);
        playersCurrentPosition.put("Anish",0);
        GameBoard gb=new GameBoard(dice,allPlayers,snakes,ladders,playersCurrentPosition,100);
        gb.startGame();
    }
}