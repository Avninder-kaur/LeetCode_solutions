class Solution {
    public int search(int[] nums, int target) {
    //    for(int i=0;i<nums.length;i++){
    //     if(nums[i]==target){
    //         return i;
    //     }
    //    } 
    //    return -1;
    int l=0;
    int r=nums.length-1;
    while(l<=r){
        int mid=l+(r-l)/2;
        if(nums[mid]==target){
            return mid;
        }
        //to find which part is sorted left or right
        //to check left part is sorted or not
        if(nums[l]<=nums[mid]){
            if(target<nums[mid] && target>=nums[l]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        //right part is sorted or not 
        else{
            if(nums[r]>=nums[mid] ){
                if(target>nums[mid] && target<=nums[r]){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        }
    }
    return -1;
    }
}