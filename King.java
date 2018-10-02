package com.company;

import java.util.Scanner;

public class King extends Piece {

    private King(int x, int y) {
        super(x, y);
    }


    public boolean isLegalMove(int dX, int dY) {
        if (dX > 0 && dX <= 8 && dY > 0 && dY <= 8) {
            if ((Math.abs(getX() - dX) == 1) && (Math.abs(getY() - dY) == 0))
                return true;
            else if ((Math.abs(getY() - dY)) == 1 &&
                    (Math.abs(getX() - dX) == 1))
                return true;
            else if (Math.abs(getX() - dX) == 0 && Math.abs(getY() - dY) == 1)
                return true;
            else return false;
        }

        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int dX = sc.nextInt();
        int dY = sc.nextInt();
        King kg = new King(x, y);
        boolean test = kg.isLegalMove(dX, dY);
        System.out.println(test);
    }
}