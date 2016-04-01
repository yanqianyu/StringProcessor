package com.position;

import java.util.ArrayList;

/*
 * Group of Position, used to save position information at one specific pos of input string
 */
public class PositionGroup {
    private ArrayList<Position> PositionList;
    
    public PositionGroup(){
        this.PositionList = new ArrayList<Position>();
    }
    
    public void AddPosition(Position p){
        this.PositionList.add(p);
    }
    
    public int getSize(){
        return PositionList.size();
    }
    
    public Position getPositionAt(int pos){
        return PositionList.get(pos);
    }

    public boolean contain(Position position) {
        for (int i = 0; i < PositionList.size(); i++){
            if (PositionList.get(i).equals(position)){
                return true;
            }
        }
        return false;
    }
}
