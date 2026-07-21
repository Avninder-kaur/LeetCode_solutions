class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int low=weights[0];
       for(int weight:weights){
        low=Math.max(low,weight);
       }
       int high=0; 
       for(int weight:weights){
        high+=weight;
       }
       while(low<high){
        int mid=low+(high-low)/2;
        int load=0;
        int day=1;
        for(int i=0;i<weights.length;i++){
            load+=weights[i];
            if(load>mid){
                day++;
                load=weights[i];
            }
        }
        if(day>days){
            low=mid+1;
        }
        else{
            high=mid;
        }
       }
       return low;
    }
}