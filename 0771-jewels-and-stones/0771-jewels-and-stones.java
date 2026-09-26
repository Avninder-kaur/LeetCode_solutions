class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // HashMap<Character,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<jewels.length();i++){
            char ch=jewels.charAt(i);
            for(char s:stones.toCharArray()){
                if(ch==s){
                    count++;
                }
            }
        }
        return count;
    }
}