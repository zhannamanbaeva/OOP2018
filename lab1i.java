import java.util.Scanner;
//import java.lang.Math;
 
public class lab1i {
    public static void main( String args[] )
    {
        Scanner input = new Scanner(System.in);
 
 int n = input.nextInt();
 int a = n/100;
 int b = (n /10) %10;
 int c = n%10;
 int z = a + b + c;

        System.out.println(z);
    }
}
 
