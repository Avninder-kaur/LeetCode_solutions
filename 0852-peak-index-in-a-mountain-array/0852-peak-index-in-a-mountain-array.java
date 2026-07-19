class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // int l=1;
        // int r=arr.length-2;
        // while(l<=r){
        //     int mid=l+(r-l)/2;
        //     if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
        //     else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) l=mid+1;
        //     else r=mid-1;
        // }
        // return 0;
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid]<arr[mid+1]){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return l;
    }
}