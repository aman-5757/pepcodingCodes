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

      int src = Integer.parseInt(br.readLine());
    
      HashSet<Integer> vis = new HashSet<>();
      hamPath(src, graph,vis,src+"", src);
      // write all your codes here
   }
   
   public static void hamPath(int src, ArrayList<Edge> [] graph, HashSet<Integer> vis, String psf, int osrc){
       
       if(vis.size() == graph.length-1){
           boolean isCycle = false;
           for(Edge e : graph[src]){
               if(e.nbr == osrc)
                {
                    isCycle = true;
                    break;
                }
           }
            System.out.print(psf);
           
           if(isCycle){
               System.out.println("*");
           }
           else{
               System.out.println(".");
               
           }
           return;
       }
       
       
       vis.add(src);
       
       for(Edge e : graph[src]){
           int nbr = e.nbr;
           if(!vis.contains(nbr)){
               hamPath(nbr, graph, vis, psf + nbr, osrc);
           }
           
       }
       
       vis.remove(src);
       
       
   }


}