import java.util.Scanner;
//import java.lang.Math;
 
 
public class Lab1b {
    public static void main(String args[]){
 
        Scanner input = new Scanner(System.in);
        int x;
        //int res;
        x = input.nextInt();
 
        if(x > 0){
            System.out.println(1);
        }else if(x < 0){
            System.out.println(-1);
        }else if(x == 0){
            System.out.println(0);
        }
        //System.out.println(res);
    }
}
 
