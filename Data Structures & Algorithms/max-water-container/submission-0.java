class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxW= 0;
        for(int i=0; i<n; i++){
            for(int j =i+1; j<n ;j++){
                int h = Math.min(heights[i], heights[j]);
                int w = j-i;
                int a = h*w;
                maxW = Math.max(maxW, a); 
            }
        }
        return maxW;
    }
}
