public class Solution {
    public int findMin(int[] nums) {
        // int n=arr.length;
        // int s=0;
        // int e=n-1;
        // int m;
        // while(s<=e){
        //     m=s+(e-s)/2;
        //     if(arr[m]>arr[e])
        //     s=m+1;
        //     else
        //     e=m;
        // }
        // return arr[e];
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]>nums[r]){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return nums[l];
    }
}