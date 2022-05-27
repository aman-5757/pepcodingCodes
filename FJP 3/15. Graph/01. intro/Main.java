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
        //because of undirected graph we are adding 2 times u-v & v-u
        graph[u].add(new Edge(u,v,w));
        graph[v].add(new Edge(v,u,w));
    }

    public static void construction(){
        //N is number of vtx which will be given as i/p
        int N = 7;     

        //Array of ArrayList and AL will contain Edge also Edge will contain (u,v,w) 
        ArrayList<Edge>[] graph = new ArrayList[N];

        //This is used because we are providing (allocating) memory to our each AL
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

        //Considering every vtx
        for(int n = 0; n < N; n++){
            System.out.print(n + " -> ");
            //considering each edge of curr vertex
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