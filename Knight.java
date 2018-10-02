package com.company;
import java.util.Scanner;

public class Knight extends Piece {
    private Knight(int x, int y) {
        super(x, y);
    }


    public boolean isLegalMove(int dX, int dY) {
        if (dX > 0 && dX <= 8 && dY > 0 && dY <= 8) {
            if ((Math.abs(dX - getX()) == 1 &&      //dx - место на которое хотим прийти
                    Math.abs(dY - getY()) == 2) ||  // getX - координата коня
                    (Math.abs(dX - getX()) == 2 &&
                            Math.abs(dY - getY()) == 1)) {
                return true;

            } else
                return false;
        }
        return false;
    }

    public String toString() {
        return getY() + "\n" + getY();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int dX = sc.nextInt();
        int dY = sc.nextInt();
        Knight kn = new Knight(x, y);
        boolean test = kn.isLegalMove(dX, dY);
        System.out.println(test);
    }


}