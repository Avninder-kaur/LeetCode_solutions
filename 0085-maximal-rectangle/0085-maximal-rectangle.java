class Solution {
    public int maximalRectangle(char[][] matrix) {
        int col=matrix[0].length;
        int row=matrix.length;
        int heights[]=new int[col];
        int maxArea=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j] == '1'){
                    heights[j]++;
                }
                else{
                    heights[j]=0;
                }
            }
            int area=largestRectangleArea(heights);
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] previous_smaller = new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() &&
                    heights[st.peek()] >= heights[i]) st.pop();
            if (st.isEmpty()) {
                previous_smaller[i] = -1;
            } else {
                previous_smaller[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();

        int[] next_smaller = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() &&
                    heights[st.peek()] >= heights[i]) st.pop();
            if (st.isEmpty()) {
                next_smaller[i] = n;
            } else {
                next_smaller[i] = st.peek();
            }
            st.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = next_smaller[i] - previous_smaller[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}