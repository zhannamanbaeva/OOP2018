import java.util.Scanner;
//import java.lang.Math;
 
 
public class Lab1b {
    public static void main(String args[]){
 
        Scanner input = new Scanner(System.in);
        int n, m;
        String res;
        n = input.nextInt();
        m = input.nextInt();
        if((n == 1 && m == 1) || (n !=1 && m != 1)){
            res = "YES";
        }else{
            res = "NO";
        }
        System.out.println(res);
    }
}
 