package com.company;

public abstract class Piece {

    private int x,y;
    private String type;
    Piece(){
        type = "no_type";
    }

    public String getType(){
        return type;
    }

    Piece(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int dX){
        x = dX;
    }
    public void setY(int dY){
        y = dY;
    }

    public abstract boolean isLegalMove(int dX, int dY);

}

