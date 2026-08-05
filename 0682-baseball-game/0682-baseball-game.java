class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String ch=operations[i];
            if(ch.equals("C")){
                st.pop();
            }
            else if(ch.equals("D")){
                int top=st.peek();
                int doublee=top*2;
                st.push(doublee);
            }
            else if(ch.equals("+")){
                int last= st.pop();
                int secondlasst=st.peek();
                st.push(last);
                st.push(last+secondlasst);
            }
            else{
              st.push(Integer.parseInt(ch));
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}