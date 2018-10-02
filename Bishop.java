package com.company;

import java.util.Scanner;

public class Bishop extends Piece{
    private Bishop(int x, int y){
        super(x,y);
    }


    public boolean isLegalMove(int dX, int dY){
        if(dX > 0 && dX <= 8 && dY > 0 && dY <= 8){

            if( Math.abs(getX() - dX) == Math.abs(getY() - dY))
                return true;

            else return false;
        }

        return false;
    }


    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int dX = sc.nextInt();
        int dY = sc.nextInt();
        Bishop bs = new Bishop(x,y);
        boolean test = bs.isLegalMove(dX,dY);
        System.out.println(test);
    }
}