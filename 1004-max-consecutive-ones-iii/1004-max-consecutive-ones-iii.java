class Solution {
    public int longestOnes(int[] nums, int k) {
       int i=0;
       int j=0;
       int maxlen=0;
       int one=0;
       while(j<nums.length){
        if(nums[j]==1) one++;
        if(j-i+1 - one <=k){
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
        else{
            if(nums[i]==1){
                one--;
            }
            i++;
                j++;
        }
       }
       return maxlen;

    }
}