class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> map=new HashMap<>();
       for(String s : strs){
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        String Key=new String(ch);
        if(!map.containsKey(Key)){
            map.put(Key,new ArrayList<>());
        }
        map.get(Key).add(s);
       }
       return new ArrayList<>(map.values());
    }
}