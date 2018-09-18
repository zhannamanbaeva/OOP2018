import java.util.Scanner;

public class Num
 {
    public static String toWords(int num){
        String s="";
        String[] s1= new String[20];
        s1[0]="zero";
        s1[1]="one";
        s1[2]="two";
        s1[3]="three";
        s1[4]="four";
        s1[5]="five";
        s1[6]="six";
        s1[7]="seven";
        s1[8]="eight";
        s1[9]="nine";
        s1[10]="ten";
        s1[11]="eleven";
        s1[12]="twelve";
        s1[13]="thirteen";
        s1[14]="fourteen";
        s1[15]="fifteen";
        s1[16]="sixteen";
        s1[17]="seventeen";
        s1[18]="eighteen";
        s1[19]="nineteen";

        String[] s2= new String[8];
        s2[0]="twenty";
        s2[1]="thirty";
        s2[2]="forty";
        s2[3]="fifty";
        s2[4]="sixty";
        s2[5]="seventy";
        s2[6]="eighty";
        s2[7]="ninety";

        if(num>=0 && num<20){
            for(int i=0; i<=19; i++){
                if(num==i){
                    s+=s1[i];
                }
            }
        }
        /*else*/ if(num>19 && num<100){
            int a=num/10;
            int b=num%10;
            for(int i=2; i<=9; ++i){
                if(a==i){
                    s+=s2[i-2]+" ";
                }
            }
            for(int i=1; i<=9; ++i){
                if(b==i){
                    s+=s2[i];   ///////
                }
            }
        }
        else if(num>=100 && num<1000){
            int a=num/100;
            int b=(num%100)/10;
            int c=num%10;
            int d=num%100;
            for(int i=1; i<=9; ++i){
                if(b==0 && c==0){
                    if(i==a){
                        s+=s1[i]+" hundred";
                    }
                }
                else{
                    if(i==a){
                        s+=s1[i]+ " hundred"+" [and] ";
                    }
                }
            }
            for(int i=10; i<=19; i++){
                if(i==d){
                    s+=s1[i];
                    return s;
                }
            }
            for(int i=2; i<=9; i++){
                if(i==c){
                    s+=s1[i];
                }
            }
        }
        else if(num>=1000 && num<10000){
            int a= num/1000;
            int b= (num%1000)/100;
            int c=((num%1000)%100)/10;
            int d=((num%1000)%100)%10;
            int e= (num%1000)%100;
            for(int i=1; i<=19; i++){
                if(a==i){
                    s+=s1[i]+" thousand";
                }
            }
            for(int i=1; i<=9; ++i){
                if(c==0 && d==0){
                    if(i==b){
                        s+=s1[i]+" hundred";
                    }
                }
                else {
                    if(i==b){
                        s+=s1[i]+" hundred"+" [and] ";
                    }
                }
            }
            for(int i=10; i<=19; ++i){
                if(e==i){
                    s+=s1[i];
                    return s;
                }
            }
            for(int i=2; i<=9; ++i){
                if(c==i){
                    s+=s2[i-2]+ " ";
                }
            }
            for(int i=1; i<=9; i++){
                if(i==d){
                    s+=s1[i];
                }
            }
        }
        else if(num>=10000 && num<100000){
            int a = num/1000;
            int b = (num%1000)/100;
            int c = ((num%1000)%100)/10;
            int d = ((num%1000)%100)%10;
            int e =( num%1000)%100;
            if(a < 20) {
                for(int i = 1; i <= 19; i++) {
                    if(a == i) {
                        s += s1[i] + " thousand ";
                    }

                }
            }else {
                int x = a/10;
                int y = a%10;

                for(int i = 2; i <= 9; i++ ) {
                    if(x == i) {
                        s += s2[i - 2] + " ";
                    }
                }

                for(int i = 1; i <= 9; i++) {
                    if(y == i) {
                        s += s1[i] + " thousand ";
                    }

                }

            }

            for(int i = 1; i <= 9; i++) {
                if(c==0 && d==0) {
                    if(i == b) {
                        s += s1[i] + " hundred";
                    }
                }
                else {
                    if(i == b) {
                        s += s1[i] + " hundred" + " [and] ";
                    }
                }
            }
            for(int i = 10; i <= 19; i++ ) {
                if(e == i) {
                    s += s1[i];
                    return s;
                }
            }
            for(int i = 2; i <= 9; i++ ) {
                if(c == i) {
                    s += s2[i - 2] + " ";
                }
            }

            for(int i = 1; i <= 9; i++ ) {
                if(i == d) {
                    s += s1[i];
                }
            }


        }

        return s;
    }


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(toWords(n));
    }
}