class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=piles[0];
        for(int pile:piles){
            high=Math.max(high,pile);
        }
        while(low<high){
            int totalhour=0;
            int mid=low+(high-low)/2;
            for(int i=0;i<piles.length;i++){
                int hour=piles[i]/mid;
                if(piles[i]%mid!=0){
                    hour++;
                }
                totalhour+=hour;
            }
            if(totalhour<=h) high=mid;
            else low=mid+1;
        }
        return high;
    }
}