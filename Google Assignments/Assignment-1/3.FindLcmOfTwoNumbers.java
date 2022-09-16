import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       int gcd=0,lcm=0;
       int x=sc.nextInt();
       int y=sc.nextInt();
       for(int i=1;i<=x && i<=y;i++){
           if(x%i==0 && y%i==0){
               gcd=i;
           }
       }
       lcm=(x*y)/gcd;//formula to calculate lcm from gcd
       System.out.print(lcm);
    }
}