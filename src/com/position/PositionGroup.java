package com.position;

import java.util.ArrayList;

public class PositionGroup {
    public ArrayList<Position> PositionList;
    
    public PositionGroup(){
        this.PositionList = new ArrayList<Position>();
    }
    
    public void AddPosition(Position p){
        this.PositionList.add(p);
    }
}