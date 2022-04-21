class Solution {
    
    /*
    -1 unvis
    1 blue
    0 red
    
    */
    
    public class pair{
        int vtx;
        int clr;
        
        pair(){}
        pair(int vtx, int clr){
            this.vtx = vtx;
            this.clr = clr;
        }
        
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int [] vis = new int[n];
        Arrays.fill(vis, -1);
        
        
        for(int v = 0; v < n; v++){
            if(vis[v] == -1){
                
                
                Queue<pair> qu = new LinkedList<>();
                qu.add(new pair(v,0));

                while(qu.size()!= 0){
                    int size = qu.size();
                    while(size-- > 0){
                        pair rem = qu.remove();

                        if(vis[rem.vtx] != -1){
                            //vis
                            if(vis[rem.vtx] == rem.clr)
                                continue;
                            else{
                                return false;
                            }
                        }
                        vis[rem.vtx] = rem.clr;
                        int src = rem.vtx;
                        for(int e : graph[src]){
                            if(vis[e] == -1){
                                qu.add(new pair(e, 1 - rem.clr));       //(1+rem.clr)%2;
                            } 
                        }   

                    }
                }
            }
        }
        
        
        
       return true; 
        
    }
}