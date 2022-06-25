import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }
   static class pair{
       int vtx;
       String path;
       pair(int vtx, String path){
           this.vtx = vtx;
           this.path = path;
       }
       pair(){}
   }
   
   
   public static void bfs(ArrayList<Edge>[] graph, int src){
       Queue<pair> qu = new ArrayDeque<>();
       
       boolean [] vis = new boolean[graph.length];
       
       //seeding -- init
       qu.add(new pair(src, src + ""));
       
       while(qu.size() != 0){
           //rmwa
           
            vis[rem.vtx] = true;
           pair rem = qu.remove();
           
           if(vis[rem.vtx]){
               continue;
           }
           
          
           
           System.out.println(rem.vtx + "@" + rem.path);
           
           for(Edge e : graph[rem.vtx]){
               int nbr = e.nbr;
               if(vis[nbr] == false){
                   qu.add(new pair(nbr, rem.path + nbr));
               }
           }
           
       }
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
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());
        bfs(graph, src);
       
   }
}