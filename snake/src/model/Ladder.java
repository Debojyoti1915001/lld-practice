package model;

public class Ladder extends BoardCell {
    private Integer endpoint;
    public Ladder(Integer startpoint,Integer endpoint){
        super(startpoint);
        this.endpoint=endpoint;
    }
    @Override
    public Integer getEnd() {
        return endpoint;
    }
}
