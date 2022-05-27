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
   
   
   
   public static void hamiltonian(ArrayList<Edge>[] graph, HashSet<Integer> hs, int src, int osrc, String asf){
       if(hs.size()  == graph.length -1){
           System.out.print(asf);

           //path or cycle
            for(Edge e : graph[osrc]){
                int nbr = e.nbr;

                if(nbr == src){
                    //cycle
                    System.out.println("*");
                    return;
                }
            }
            System.out.println(".");
            return;

       }


    //    vis[src] = true;
    hs.add(src);

        for(Edge e : graph[src]){
            int nbr = e.nbr;

            if(!hs.contains(nbr)){
                hamiltonian(graph,vis, nbr, osrc, asf + nbr);
            }
        }


    //    vis[src] = false;
    hs.remove(src);

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

      //code
    //   boolean [] vis = new boolean[vtces];

      HashSet<Integer> hs = new HashSet<>();
    //   src , src -->  current src and original src
      hamiltonian(graph, hs, src, src, src+"" );
      
   }


}