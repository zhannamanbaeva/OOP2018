package com.company;

import java.util.Scanner;

public class Pawn extends Piece {
    private Pawn(int x, int y){
        super(x,y);
    }


    public boolean isLegalMove(int dX, int dY){
        if(dX > 0 && dX <= 8 && dY > 0 && dY <= 8){

            if( Math.abs(dY - getY()) <= 2 && Math.abs(dX - getX()) == 0)
                return true;
            if( Math.abs(dY - getY()) <= 1 && Math.abs(dX - getX()) == 0)
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
        Pawn pn = new Pawn(x,y);
        boolean test = pn.isLegalMove(dX,dY);
        System.out.println(test);
    }
}