package model;

import java.util.Map;

public class BoardCellFactory {
    public static BoardCell create(int i, Map<Integer, Integer> s, Map<Integer, Integer> l) {

        if(s.containsKey(i)){
            return new Snake(i,s.get(i));
        }else if(l.containsKey(i)){
            return new Ladder(i,l.get(i));
        }else{
            return new NormalCell(i);
        }
    }
}
