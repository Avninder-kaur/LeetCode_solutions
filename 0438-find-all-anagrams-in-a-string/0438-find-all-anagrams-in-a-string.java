class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        // List<Integer> ans = new ArrayList<>();

        // char[] arr = p.toCharArray();
        // Arrays.sort(arr);
        // String target = new String(arr);

        // int k = p.length();

        // for(int i = 0; i <= s.length() - k; i++) {

        //     char[] temp = s.substring(i, i + k).toCharArray();
        //     Arrays.sort(temp);

        //     if(target.equals(new String(temp))) {
        //         ans.add(i);
        //     }
        // }

        // return ans;

        List<Integer> ans = new ArrayList<>();

        HashMap<Character,Integer> pMap = new HashMap<>();
        HashMap<Character,Integer> windowMap = new HashMap<>();

        for(char ch : p.toCharArray()){
            pMap.put(ch,pMap.getOrDefault(ch,0)+1);
        }

        int i = 0;
        int j = 0;
        int k = p.length();

        while(j < s.length()){

            char ch = s.charAt(j);
            windowMap.put(ch,windowMap.getOrDefault(ch,0)+1);

            if(j - i + 1 < k){
                j++;
            }

            else if(j - i + 1 == k){

                if(windowMap.equals(pMap)){
                    ans.add(i);
                }

                char left = s.charAt(i);

                windowMap.put(left,windowMap.get(left)-1);

                if(windowMap.get(left) == 0){
                    windowMap.remove(left);
                }

                i++;
                j++;
            }
        }

        return ans;
    }
}
