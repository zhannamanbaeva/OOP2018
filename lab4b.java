import java.util.Scanner;
//import java.lang.Math;
 
 
public class Lab1b {
    public static void main(String args[]){
 
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        int k[ ] = new int [n];
        for(int i = 0; i < n; i++){
           k[i] = input.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(k[i] % 2 == 0){
                System.out.print(k[i] + " ");
            }
        }
    }
}