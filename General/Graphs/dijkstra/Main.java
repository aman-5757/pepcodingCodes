public class Main{
    public class Edge{
        int v;
        int w;
        Edge(){
        }
        Edge(int v, int w){
            this.v = v;
            this.w = w;
        }
    }

    public static void addEdge(ArrayList<Integer>[] graph, int u, int v, int w){
        graph[u].add(new Edge(v,w));
        graph[v].add(new Edge(u,w));
    }

    public static void display(ArrayList<Integer>[] graph, int N){
        StringBuilder sb = new StringBuilder();
        fo(int i = 0; i<N; i++){
            sb.append(i + " -> ");
            for(Edge e : graph){
                sb.append("(" + e.v + ", " + e.w +") ");

            }
            sb.append('\n');
        }
        sb.append('\n');
        System.out.println(sb.append('\n'));

    }

    public static void main(Stirng [] args){
        int N = 9;
        ArrayList<Integer>[] graph = new ArrayList[N];
        for(int i = 0; i<N; i++)
            graph[i] = new ArrayList<>();
        
        addEdge(graph,0,1,4);
        addEdge(graph,0,7,8);
        addEdge(graph,1,2,8);
        addEdge(graph,1,7,11);
        addEdge(graph,2,8,2);
        addEdge(graph,2,5,4);
        addEdge(graph,2,3,7);
        addEdge(graph,8,6,6);
        addEdge(graph,8,7,7);
        addEdge(graph,6,5,2);
        addEdge(graph,5,3,14);
        addEdge(graph,5,4,10);
        addEdge(graph,3,4,9);
        addEdge(graph,7,6,1);

        display(graph, N);

    }
}