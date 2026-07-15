class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int longestlength=0;
        for(int num:nums){
            set.add(num);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int currentnum=num;
                int length=1;
                while(set.contains(currentnum+1)){
                    currentnum++;
                    length++;
                }
                longestlength=Math.max(length,longestlength);
            }
        }
return longestlength;
    }
}