import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int gcd=0;
       int x=sc.nextInt();
       int y=sc.nextInt();
       for(int i=1;i<=x && i<=y;i++){//Iterate through x and y
           if(x%i==0 && y%i==0){//to check the greatest common number divided by x and y
               gcd=i;
           }
       }
       System.out.print(gcd);
    }
}