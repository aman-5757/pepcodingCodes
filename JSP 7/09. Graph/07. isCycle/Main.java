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
   
   
   public static boolean bfs(ArrayList<Edge>[] graph, int src, boolean [] vis){
       Queue<Integer> qu = new ArrayDeque<>();
       
      
       
       //seeding -- init
       qu.add(src);
       
       while(qu.size() != 0){
           //rmwa
           
            
           int rem = qu.remove();
           
           if(vis[rem]){
               return true;
           }
           
           vis[rem] = true;

           for(Edge e : graph[rem]){
               int nbr = e.nbr;
               if(vis[nbr] == false){
                   qu.add( nbr);
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
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

       


     
      boolean [] vis = new boolean[graph.length];

      for(int v = 0; v < vtces; v++){
        if(vis[v] == false){
            boolean singleAns = bfs(graph, 0, vis);
            if(singleAns){
                System.out.println("true");
                return;
            }
        }
      }
      System.out.println("false");
       
   }
}