class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=nums[0];
        for(int num:nums){
            high=Math.max(high,num);
        }
        while(low<high){
            int mid=low+(high-low)/2;
            int total=0;
            for(int i=0;i<nums.length;i++){
            total+=(nums[i]+mid-1)/mid;
            }
            if(total<=threshold){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}