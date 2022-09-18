import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,ctr=0,max=0,mode=0,median=0;
		int[] arr=new int[n];
		int l=0,r=n-1;
		int mid=l+(r-l)/2;
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    sum+=arr[i];
		 }
		 Arrays.sort(arr);
		 for(int i=0;i<n;i++){
		     median=arr[mid];
		 }
		 for(int i=0;i<n;i++){
		     for(int j=i+1;j<n;j++){
		         if(arr[i]==arr[j]){
		             ctr++;
		         }
		     }
		     if(max<ctr){
		         max=ctr;
		         mode=arr[i];
		     }
		 }
		 
		System.out.println("Mean is " + sum/n);
		System.out.println("Median is " + median);
		System.out.println("Mode is " + mode);
	}
}