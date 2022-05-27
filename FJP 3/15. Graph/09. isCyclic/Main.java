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
   
   public static boolean solve(ArrayList<Edge>[] graph, int src, boolean [] vis){
       //bfs

       Queue<Integer>  qu = new LinkedList<>();
       qu.add(src);
       
       
       while(qu.size() != 0){
            int rem = qu.remove();
            
            if(vis[rem])
                return true;
                
            vis[rem] = true;
            for(Edge e : graph[src]){
                int nbr = e.nbr;
                
                if(!vis[nbr]){
                    qu.add(nbr);
                }
            }
            
       }
       return false;
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
        boolean [] vis = new boolean[graph.length];
        
    for(int i = 0; i<vtces; i++){
        if(!vis[i]){
            boolean ans = solve(graph,i,vis);
            if(ans){
                System.out.println(true);
                return;
            }
        }
    }   
    System.out.println(false);
   }
}