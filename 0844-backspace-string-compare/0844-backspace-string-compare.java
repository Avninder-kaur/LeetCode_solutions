class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>st=new Stack<>();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch == '#'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
                else{
                    st.push(ch);
                }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }



         Stack<Character>st1=new Stack<>();
        StringBuilder ans1=new StringBuilder();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(ch == '#'){
                if(!st1.isEmpty()){
                    st1.pop();
                }
            }
                else{
                    st1.push(ch);
                }
        }
        while(!st1.isEmpty()){
            ans1.append(st1.pop());
        }
return ans1.reverse().toString().equals(ans.reverse().toString());
    }
}