import java.util.Stack;

class Solution {
    
    public long sumSubarrayMins(int[] a) {
        Stack<Integer> stack=new Stack<>();
        int n=a.length;
        long count=0;
        for(int i=0;i<=n;i++){
            while(!stack.isEmpty() && (i==n||a[stack.peek()]>a[i])){
                int mid=stack.pop();
                int l=mid-(stack.isEmpty()?-1:stack.peek());
                int r=i-mid;
                count+=(long)a[mid]*(l)*(r);
            }
            stack.push(i);
        }
        return count;
    }
     public long sumSubarrayMaxs(int[] a) {
        Stack<Integer>stack=new Stack<>();
        int n=a.length;
        long count=0;
        for(int i=0;i<=n;i++){
            while(!stack.isEmpty()&&(i==n||a[stack.peek()]<a[i])){
                int mid=stack.pop();
                int l=mid-(stack.isEmpty()?-1:stack.peek());
                int r=i-mid;
                
                count+=(long)a[mid]*(l)*(r);
            }
            stack.push(i);
        }
        
        return count;
    }
    
    public long subArrayRanges(int[] nums) {
        return sumSubarrayMaxs(nums)-sumSubarrayMins(nums);
    }
}