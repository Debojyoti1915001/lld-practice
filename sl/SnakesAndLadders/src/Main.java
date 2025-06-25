import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> snakes = Map.of(
                14, 7,
                31, 26,
                38, 20,
                84, 58,
                97, 79
        );

        Map<Integer, Integer> ladders = Map.of(
                3, 22,
                5, 8,
                11, 26,
                20, 29,
                27, 74
        );
        Player p1=new Player("1","Debo");
        Player p2=new Player("2","Anish");
        List<Player>p= new ArrayList<>();
        p.add(p1);
        p.add(p2);
        Board board = new Board(100, snakes, ladders);
    }
}