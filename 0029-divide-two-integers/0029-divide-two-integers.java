class Solution {
    public int divide(int a, int b) {
        if(a==Integer.MIN_VALUE && b==-1) return Integer.MAX_VALUE;
        boolean negative=false;
        if(b==1) return a;
        if(b==-1) return -a;
        if((a<0 && b>0) ||(a>0 && b<0)){
            negative=true;
        }
        long c=Math.abs((long)a);
        long d=Math.abs((long)b);
       int count=0;
       while(c>=d){
        c=c-d;
        count++;
       } 
       return negative ? -count : count;
    }

}