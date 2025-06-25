package model;

public class NormalCell extends BoardCell{
    public NormalCell(Integer startpoint){
        super(startpoint);
    }
    @Override
    public Integer getEnd() {
        return startpoint;
    }
}
