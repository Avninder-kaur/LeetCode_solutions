class Solution {
    public int maxArea(int[] height) {
int l=0;
int r=height.length-1;
int maxarea=0;
while(l<r){
    int heightt=Math.min(height[l],height[r]);
    int width=r-l;
    int area=heightt*width;
    maxarea=Math.max(maxarea,area);
    if(height[l]<height[r]) l++;
    // if both are equal then its our choice to move whivh pointer left or right
    else r--;
}
return maxarea;
    }
}