class Solution {
    public int majorityElement(int[] nums) {
        int target=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(count==0){
                target=num;
            }
            if(num==target){
                count++;
            }
            else{
                count--;
            }
        }
        return target;
    }
}