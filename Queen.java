package com.company;

import java.util.Scanner;

public class Queen extends Piece{
    private Queen(int x, int y){
        super(x,y);
    }


    public boolean isLegalMove(int dX, int dY){
        if(dX > 0 && dX <= 8 && dY > 0 && dY <= 8){

            if( Math.abs(getX() - dX) == Math.abs(getY() - dY))
                return true;

            else if (getX() == dX)
                return true;

            else if (getY() == dY)
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
        Queen qn = new Queen(x,y);
        boolean test = qn.isLegalMove(dX,dY);
        System.out.println(test);
    }
}
