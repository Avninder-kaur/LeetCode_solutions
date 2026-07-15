class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            int req=target-curr;
            if(map.containsKey(req)){
                return new int[]{map.get(req),i};
            }
            map.putIfAbsent(curr,i);
        }
        return new int[]{};
    }
}