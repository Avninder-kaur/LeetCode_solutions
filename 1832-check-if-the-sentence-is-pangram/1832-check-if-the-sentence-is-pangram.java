class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
        }
        return map.size()==26;
    }
}