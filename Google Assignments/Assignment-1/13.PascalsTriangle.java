import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int empty=n;
    int num=1;
    for(int i=0;i<n;i++)
      {
        for(int j=1;j<=empty;j++)
          {
            System.out.print(" ");
          }
        num=1;
        for(int k=0;k<=i;k++)
          {
            System.out.print(num+" ");
            num=num*(i-k)/(k+1);
          }
        empty--;
        System.out.println();
      }
  }
}
