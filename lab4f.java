import java.util.Scanner;
//import java.lang.Math;
 
 
public class Lab1b {
    public static void main(String args[]){
 
        Scanner input = new Scanner(System.in);
        int n;
        int cnt = 0;
        n = input.nextInt();
        int k[ ] = new int [n];
        for(int i = 0; i < n; i++){
           k[i] = input.nextInt();
        }
        for(int i = 1; i < n-1; i++){
            if(k[i] > k[i-1] && k[i] > k[i+1]){
                cnt++;
            }
        }
        System.out.print(cnt);
 
    }
}
 