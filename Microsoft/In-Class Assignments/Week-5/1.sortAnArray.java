//#merge sort
class Solution {
	public void merge(int arr[],int low,int mid,int high) {
		int n=mid-low+1;
		int m=high-mid;
		int left[]=new int[n];
		int right[]=new int[m];
		for(int i=0;i<n;i++){left[i]=arr[low+i];}
		for(int j=0;j<m;j++){right[j]=arr[mid+1+j];}
		int i=0;
		int j=0;
		int k=low;
		while(i<n && j<m) {
			if(left[i]<right[j]) arr[k++]=left[i++];
			else arr[k++]=right[j++];
        }
		while(i<n){arr[k++]=left[i++];}
		while(j<m){arr[k++]=right[j++];}
	}
	public void mergesort(int arr[],int low, int high) {
		if(low>=high) return;
		int mid=(low+high)/2;
		mergesort(arr,low,mid);
		mergesort(arr, mid+1, high);
		merge(arr,low,mid,high);
	}
	public int[] sortArray(int[] nums) {
		mergesort(nums,0,nums.length-1);
		return nums;
	}
}

//#quick sort
class Main {
    public int[] sortArray(int[] arr) {
        
        quickSort(arr , 0 , arr.length-1);
        return arr;
    }
    
  void  quickSort(int arr[] , int l , int r)
    {
        if(l<r)
        {
            int p = partition(arr , l , r);
            
            quickSort(arr, l , p-1);
            quickSort(arr , p+1 , r);
        }
    }
    
    int partition(int arr[] , int l ,int r)
    {
        int pivot=arr[r];
        int i=l-1;
        
        for(int j=l ; j<r ; j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr , i+1 , r);
        return i+1;
    }
    
    void swap(int arr[] , int i , int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
