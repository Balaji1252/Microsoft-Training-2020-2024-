import java.util.*;
class Hello {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    //get the coordinates x and y from three points
    int x1=sc.nextInt();
    int y1=sc.nextInt();
    int x2=sc.nextInt();
    int y2=sc.nextInt();
    int x3=sc.nextInt();
    int y3=sc.nextInt();
    //calculate the distance
    int d1=x1*(y2-y3);
    int d2=x2*(y3-y1);
    int d3=x3*(y1-y2);
    //to calculate area
    float area=(d1+d2+d3)/2;
    System.out.print (Math.abs((int)area));
  }
}