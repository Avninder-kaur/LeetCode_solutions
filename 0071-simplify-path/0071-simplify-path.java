class Solution {
    public String simplifyPath(String path) {
        Stack<String>st=new Stack<>();
        String[]parts=path.split("/");
        for(String part:parts){
            if(part.equals("") || part.equals(".")){

            }
            else if(part.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(part);
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.insert(0,"/"+st.pop());
        }
        if(ans.length()==0) return "/";
        return ans.toString();
    }
}                                                                        