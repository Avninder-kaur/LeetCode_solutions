class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count=new int[26];
        for(Character ch : s.toCharArray()){
            count[ch-'a']++;
        }
        Stack<Character>st=new Stack<>();
        StringBuilder ans=new StringBuilder();
        boolean [] seen=new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            // if(st.isEmpty()){
            //     st.push(ch);
            // }
            count[ch-'a']--;
            if(seen[ch-'a']) continue;
            else{
                while(!st.isEmpty() && ch<st.peek() && count[st.peek()-'a'] > 0){
                   char top= st.pop();
                    seen[top-'a']=false;

                }
                st.push(ch);
                seen[ch-'a']=true;
            }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}