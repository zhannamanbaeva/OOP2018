import java.util.Scanner;
//import java.lang.Math;
 
public class lab1c {
    public static void main( String args[] )
    {
        Scanner input = new Scanner(System.in);
 
        int n;
        int k;
        int m;
 
        n = input.nextInt();
        k = input.nextInt();
        m = k%n;
      
 
        System.out.println(m);
    }
}
 
