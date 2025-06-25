package model;

public class Jumper {
    private Integer startpoint;
    private Integer endpoint;

    public Jumper(Integer startpoint, Integer endpoint) {
        this.startpoint = startpoint;
        this.endpoint = endpoint;
    }
    public Integer getStart(){
        return startpoint;
    }
    public Integer getEnd(){
        return endpoint;
    }
}
