import java.util.Scanner;
//import java.lang.Math;
 
 
public class Lab1b {
    public static void main(String args[]){
 
        Scanner input = new Scanner(System.in);
        int x,y;
        //int res;
        x = input.nextInt();
        y = input.nextInt();
 
        if(x > y){
            System.out.println(1);
        }else if(x < y){
            System.out.println(2);
        }else if(x == y){
            System.out.println(0);
        }
        //System.out.println(res);
    }
}