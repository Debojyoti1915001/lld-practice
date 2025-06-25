package model;

public abstract class BoardCell {
    protected Integer startpoint;

    public BoardCell(Integer startpoint) {
        this.startpoint = startpoint;
    }
    public Integer getStart(){
        return startpoint;
    }
    public abstract Integer getEnd();

}
