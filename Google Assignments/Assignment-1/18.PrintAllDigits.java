import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt(),count=0;
    while(N>0){
      int num=N%10;
      System.out.println(num);
      N/=10;
    }
  }
}