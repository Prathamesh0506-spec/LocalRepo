//***** 
// JAVA PROGRAMS FILE FOR DESIGN & ANALYSIS OF ALGORITHM -> CLOUD


/********************************************-> UNIT-ADVANCED_GRAPH-ALGORITHMS <-********************************************/


//**********ALL PATHS IN GRAPH BASIC PROGRAMM ***********/

/*import java.util.ArrayList;

public class allPaths {
    static class edge {
        int src;
        int dest;

        public edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<edge> graph[]){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<edge>();
        }

        graph[0].add(new edge(0, 2));

        graph[1].add(new edge(1, 2));
        graph[1].add(new edge(1, 3));
        
        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 1));
        graph[2].add(new edge(2, 3));

        graph[3].add(new edge(3, 1));
        graph[3].add(new edge(3, 2));
    }

    // LOGIC FOR DFS FUNCTION
    public static void dfs(ArrayList<edge> graph[], int curr, boolean vis[]){
        System.out.print(curr + " ");
        vis[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++){
            edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis); // recurse to neighbor (fixed)
            }
        }
    }

    // LOGIC FOR PRINTING PATH
    public static void printAllPath(ArrayList<edge> graph[], boolean vis[], int curr, String path, int tar){
        if (curr == tar) {
            System.out.println(path);
            return;
        }
        for(int i = 0; i < graph[curr].size(); i++){
            edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                vis[curr] = true;
                printAllPath(graph, vis, e.dest, path + "->" + e.dest, tar); // fixed args & path
                vis[curr] = false;
            }
        }
    }

    public static void main(String[] args) {
        int V = 4; // consistent with createGraph (nodes 0..3)
        ArrayList<edge> graph[] = new ArrayList[V];
        createGraph(graph);

        int src = 0; 
        int tar = 3; // choose a target within 0..3
        System.out.println("All paths from " + src + " to " + tar + ":");
        printAllPath(graph, new boolean[V], src, String.valueOf(src), tar);

        System.out.println("\nDFS traversal from src:");
        dfs(graph, src, new boolean[V]);
        System.out.println();
    }
}
*/



//**********CYCLE IN DIRECTED GRAPH ***********/

/* import java.util.ArrayList;

public class cycleInDirected {
    static class edge{
        int src;
        int dest;

        public edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<edge> graph[] ){
        ///INTIALIZING LIST OF LIST'S 
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0, 2));
        graph[1].add(new edge(1, 0));
        graph[2].add(new edge(2, 3));
        graph[3].add(new edge(3, 0));
    }

    //LOGIC FOR CHKING IS CYCLE IS PRESENT
    public static boolean isCycleDirected(ArrayList<edge>graph[], boolean vis[], int curr, boolean rec[]){
        vis[curr] = true;
        rec[curr] = true;

        for(int i = 0; i<graph[curr].size(); i++){      //TYA NODE CHE SAGLE NEIGHB VISIT HOTAT
            edge e = graph[curr].get(i);        //NODE KADHUN GHENE & EDGE STORE KARNE

            //CORNER CASE 1----> TYA NODE CHA NEIGH CYCYLE MADHE ASLYAS
            if(rec[e.dest]){
                return true;
            }

            //CORNER CASE 2----> CODE KARAYCHI GARAJ NAHI


            //CORNER CASE 3----> KONI TARI AADHICH VISIT KELELA NEIGH ASEL TAR
            else if(!vis[e.dest]){
                if(isCycleDirected(graph, vis, e.dest, rec)){
                    return true;
                }
            }
        }
            rec[curr]  = false;
            return false;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<edge> graph[] = new ArrayList[V];
        createGraph(graph);

        boolean vis [] = new boolean[V];
        boolean rec [] = new boolean[V];

         boolean isCycle = false;

        //
        for(int i = 0; i<V; i++){
            if(!vis[i]){
                if(isCycleDirected(graph, vis, i, rec)){
                    isCycle = true;
                    break;
                }
            }
        }
                System.out.println("Cycle Present: " + isCycle);

    }
}


*/