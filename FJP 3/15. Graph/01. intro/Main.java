import java.util.*;
public class Main{
    public static class Edge{
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt){
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void addEdge(ArrayList<Edge>[] graph, int u, int v, int w){
        graph[u].add(new Edge(u,v,w));
        graph[v].add(new Edge(v,u,w));
    }

    public static void construction(){
        int N = 7;      //number of nodes
        ArrayList<Edge>[] graph = new ArrayList[N];
        for(int i = 0; i < N; i++){
            graph[i] = new ArrayList<>();
        }
        //as an input
        addEdge(graph, 0 , 1, 10);
        addEdge(graph, 0 , 3, 10);
        addEdge(graph, 1 , 2, 10);
        addEdge(graph, 2 , 3, 40);
        addEdge(graph, 3 , 4, 2);
        addEdge(graph, 4 , 5, 2);
        addEdge(graph, 5 , 6, 3);
        addEdge(graph, 4 , 6, 8);
       
       //display
       display(graph, N);
    }


    public static void display(ArrayList<Edge>[] graph, int N){
        // N is number of vertex / Nodes
        for(int n = 0; n < N; n++){
            System.out.print(n + " -> ");
            for(Edge e : graph[n]){
                int u = e.src;
                int v = e.nbr;
                int w = e.wt;

                System.out.print(u +" - " + v  + " @ " +  w + ", " );
            }
            System.out.println();
        }

    }

    public static void main(String [] args){
        construction();
        
    }
}