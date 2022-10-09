import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k=0;
        double arr[]=new double[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            arr[k]=Double.valueOf(nums1[i]);
            k++;
        }
        for(int i=0;i<nums2.length;i++){
            arr[k]=Double.valueOf(nums2[i]);
            k++;
        }
        double res=0.0;
        Arrays.sort(arr);
        if(arr.length%2!=0){
            res=arr[arr.length/2];
        }else{
            res=(arr[arr.length/2]+arr[arr.length/2-1])/2;
        }
        return res;
    }
}
