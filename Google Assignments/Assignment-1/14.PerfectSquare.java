import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double sq=Math.sqrt(n);
    if(sq==Math.floor(sq))
    {
      System.out.print(" is a perfect Square");
    }
    else{
      System.out.print(" is not a perfect Square");
    }
  }
}