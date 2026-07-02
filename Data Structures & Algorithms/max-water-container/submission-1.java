class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l =0; 
        int r = n-1; 
        int maxA = 0;
        while(l<r){
            int h = Math.min(heights[l], heights[r]);
            int w = r-l;

            int a = h*w;
            if(a>maxA){
                maxA=a;
            }
            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxA;
    }
}
