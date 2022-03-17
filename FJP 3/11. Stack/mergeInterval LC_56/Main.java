class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->{
           return a[0] - b[0]; 
        });
        Stack<int []> st = new Stack<>();
        st.push(intervals[0]);
        
        for(int i = 1; i<intervals.length; i++){
            int [] t = st.pop();    //1 3
            int s1 = t[0];
            int e1 = t[1];
            
            int s2 = intervals[i][0];
            int e2 = intervals[i][1];
            
            
            
            //mergeCondition
            if(s2 <= e1){
                int em = Math.max(e1, e2);
                int [] merge = {s1, em};
                st.push(merge);
                
                //st.push(new int[]{s1,em});
                
            }
            else{
                st.push(t);
                st.push(intervals[i]);
            }
            
        }
        int [][] ans = new int[st.size()][2];
        
        for(int i = ans.length-1; i>=0; i--){
            int [] tmp = st.pop();
            ans[i][0] = tmp[0];
            ans[i][1] = tmp[1];
        }
        return ans;
        
    }
}



//||   