import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       b=a+b;
       a=b-a;
       b=b-a;
       
       System.out.print(a+" "+b);
    }
}