package model;

public class Snake extends BoardCell{
    private Integer endpoint;
    public Snake(Integer startpoint,Integer endpoint){
        super(startpoint);
        this.endpoint=endpoint;
    }
    @Override
    public Integer getEnd() {
        return endpoint;
    }
}
