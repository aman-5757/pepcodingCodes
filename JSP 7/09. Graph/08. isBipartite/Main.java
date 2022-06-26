import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }
   
   static class pair{
       int vtx;
       int color;
       pair(){}
       pair(int vtx, int color){
           this.vtx = vtx;
           this.color = color;
       }
   }
   
   
   public static boolean isBipartite(ArrayList<Edge>[] graph){
       int n = graph.length;
       int [] vis = new int[n];
    //   for(int i = 0; i<n; i++)
    //     vis[i] = -1;
        Arrays.fill(vis, -1);
        
    //   {
    //       -1: unvis
    //       0: red
    //       1: blue
           
    //   }
        
        for(int v = 0 ; v < n; v++){
            if(vis[v] == -1){
                Queue<pair> qu = new LinkedList<>();
                qu.add(new pair(v, 0));
                
                //seeding done
                
                while(qu.size() != 0){
                    pair rem = qu.remove();
                    
                    
                    if(vis[rem.vtx] != -1){
                        //chck conflict
                        if(vis[rem.vtx] == rem.color){
                            continue;
                        }
                        else{
                            //conflict found
                            return false;
                        }
                    }
                    
                    
                    vis[rem.vtx] = rem.color;
                    
                    for(int e : graph[rem.vtx]){
                        if(vis[e] == -1){
                            qu.add(new pair(e, 1 - rem.color));         //(rem.color + 1 ) % 2
                        }
                    }
                }
                
                
                
                
                
            }
            
            
        }
        return true;
        
        
   }
   

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }
    
    System.out.println(isBipartite(graph));    
      
   }
}