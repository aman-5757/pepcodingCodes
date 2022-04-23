import java.io.*;
import java.util.*;

public class Main {
    static class pp{
        //prims pair
        int s;      //source
        int cost;       //cost
        
        pp(){}
        pp(int s, int cost){
            this.s = s;
            this.cost = cost;
        }
        
    }
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

    public static int primsAlgo(ArrayList<Edge>[] graph){
        int src = 0;//source

        int n = graph.length;
        PriorityQueue<pp> pq = new PriorityQueue<>((a,b)->{
            return a.cost-b.cost;
        });
        
        boolean [] vis = new boolean[n];
        int minCost = 0;


        //seeding
        pq.add(new pp(src, 0));
        
        
        while(pq.size() != 0){
            //remove
            pp rem = pq.remove();
        
            
            //work

            if(vis[rem.s] == false)
                minCost += rem.cost;

            //mark
            vis[rem.s] = true;
            
            //add
            for(Edge e : graph[rem.s]){
                int nbr = e.nbr;
                int cost = e.wt;
                if(vis[nbr] == false){
                    pq.add(new pp(nbr, cost));
                }
            }
        }
        return minCost;
        
        
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

      //code starts here
      int ans = primsAlgo(graph);
      System.out.println(ans);
   }

}