class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int [] nsol = nextSmallerOnLeft(heights);
        int [] nsor = nextSmallerOnRight(heights);
        int max = 0;
        for(int i = 0; i<heights.length; i++){
            int w  = nsor[i]-nsol[i]-1;
            int area = heights[i]*w;
            max = Math.max(max,area);
        }
        return max;
        
    }
    public static int [] nextSmallerOnLeft(int [] arr){
        int [] ans = new int [arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length-1; i>=0; i--){
            while(st.size()!=0 && arr[st.peek()]>arr[i]){
                int idx = st.pop();
                ans[idx] = i;
            }
            st.push(i);
        }
        while(st.size()!=0){
            int idx = st.pop();
            ans[idx] =-1;
        }
        return ans;
    }
    public static int [] nextSmallerOnRight(int [] arr){
        int [] ans = new int [arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<arr.length; i++){
            while(st.size()!=0 && arr[st.peek()]>arr[i]){
                int idx = st.pop();
                ans[idx] = i;
            }
            st.push(i);
        }
        while(st.size()!=0){
            int idx = st.pop();
            ans[idx] = arr.length;
        }
        return ans;
    }
}