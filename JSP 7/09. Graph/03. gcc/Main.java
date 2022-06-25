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
   
   
   public static void dfs(ArrayList<Edge>[] graph, ArrayList<Integer> temp, boolean [] vis, int src){
       vis[src] = true;
       temp.add(src);
       for(Edge e : graph[src]){
          int nbr = e.nbr;
          if(vis[nbr] == false){
              dfs(graph, temp, vis, nbr);
          }
       }
       
   }
   
   
   public static void gcc(ArrayList<Edge>[] graph, ArrayList<ArrayList<Integer>> comps){
       int vtx = graph.length;
       boolean [] vis = new boolean[vtx];
       
       for(int i = 0; i<vtx; i++){
           if(vis[i] == false){
               ArrayList<Integer> temp = new ArrayList<>();
               dfs(graph, temp, vis, i);
               comps.add(temp);
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
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
      
        gcc(graph, comps);

      System.out.println(comps);
   }
}