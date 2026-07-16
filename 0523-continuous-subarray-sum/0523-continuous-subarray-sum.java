class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
            
        //     if(j-i+1>=2 && sum%k==0){
        //         return true;
        //     }
        // }
        // }
        // return false;
        HashMap<Integer,Integer>map=new HashMap<>();
        // used to store 1st index of remainder
        int sum=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=sum%k;
            if(map.containsKey(rem)){
                if(i-map.get(rem)>=2){
                    return true;
                }
            }
            else{
                map.put(rem,i);
            }
        }
            return false;
        }
}