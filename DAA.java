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



//**********CYCLE IN UN-DIRECTED GRAPH ***********/

/*import java.util.ArrayList;

public class CycleInUndirected{
    static class edge{
        int src;
        int dest;

        public edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<edge> graph[]){
        for (int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0,2));
        graph[1].add(new edge(1, 0));
        graph[2].add(new edge(2, 3));
        graph[3].add(new edge(3, 0));
    }

    //LOGIC FOR FINDING CYCLE
    public static boolean isCycleUndirected(ArrayList<edge> graph[], boolean vis[], int curr, int parent){
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++){
            edge e = graph[curr].get(i);   // ✅ fixed here

            if (vis[e.dest] && e.dest != parent){
                return true;
            }
            else if (!vis[e.dest]) {
                if (isCycleUndirected(graph, vis, e.dest, curr)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<edge> graph[]  = new ArrayList[V];
        createGraph(graph);

        boolean[] vis = new boolean[V];
        System.out.println(isCycleUndirected(graph, vis, 0, -1));   // ✅ fixed here
    }
}
 */




//**********BELLMAN FORD ALGORITHM ***********/

/*import java.util.ArrayList;

public class BelmanFordAlgo {
    static class edge{
        int src;
        int dest;
        int wt;

        public edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    //SAMPLE GRAPH TAYAR KARAYCHA
    public static void createGraph(ArrayList<edge> graph[], int V){
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<edge>();
        }

        // SAMPLE EDGES (Directed)
        graph[0].add(new edge(0, 1, 2));
        graph[0].add(new edge(0, 2, 4));
        graph[1].add(new edge(1, 2, -1));
        graph[1].add(new edge(1, 3, 2));
        graph[2].add(new edge(2, 3, 3));
        graph[3].add(new edge(3, 4, -2));
    }

    public static void bellamFord(ArrayList<edge> graph[], int src, int V){
        int dist[] = new int[V];
        for(int i = 0; i<V; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;        //DIST ARRAY MADHE SAGLYA VALUE INFINITY LA SET KARNE
            }
        }

        // (V-1) VALA LOOP
        for(int k = 0; k < V-1; k++){     
            //SAGLYA EDGES VAR RELAXATION KARAYCHA
            for(int i = 0; i < V; i++){
                for(int j = 0; j < graph[i].size(); j++){         //KAMI DIST YEYIPARYANT
                    edge e = graph[i].get(j);
                    int u = e.src;
                    int v = e.dest;

                    if(dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[v]){
                        dist[v] = dist[u] + e.wt;
                    }
                }
            }
        }

        //PRINTING DIST ARRAY
        System.out.println("Shortest distance from src = " + src);
        for(int i = 0; i < dist.length; i++){
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<edge>[] graph = (ArrayList<edge>[]) new ArrayList[V];

        createGraph(graph, V);
        bellamFord(graph, 0, V);
    }
}
 */





//**********DIJKSTR'S ALGORITHM ***********/

/*import java.util.ArrayList;
import java.util.PriorityQueue;

public class dijkstrasAlgo {

    static class edge{
        int src;
        int dest;
        int wt;

        public edge(int s, int d, int wt){
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<edge> graph[]){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<edge>();
        }
            graph[0].add(new edge(0, 2, 5));
            graph[1].add(new edge(1, 0, 3));
            graph[2].add(new edge(2, 3, 1));
            graph[3].add(new edge(3, 0, 4));
    }

    public static class pair implements Comparable<pair>{       
        int node;
        int dist;

        public pair(int n, int d){
            this.node = n;
            this.dist = d;
        }

        @Override
        public int compareTo(pair p2){
            return this.dist - p2.dist;
        }
    }

    //LOGIC FOR DIJEKSTRA'S
    public static void dijkistras(ArrayList<edge>graph[], int src, int V){

        PriorityQueue<pair> pq = new PriorityQueue<>();
        int dist[] = new int[V];        //DIST STORE KARAYCHA ARRAY

        for(int i= 0; i<V; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;        //Intially sagle value infinity la store karne
            }
        }

        boolean vis[] = new boolean[V];     //visited cha array
        pq.add(new pair(src,0));      //SOURCE LA ADD KARNE

        while(!pq.isEmpty()){
            pair curr = pq.remove();

            if(!vis[curr.node]){
                vis[curr.node] = true;      //VISIT KARUN GHENE

                //EDGES & TYACHE NEIGH KADHNE
                for(int i = 0; i<graph[curr.node].size(); i++){
                    edge e = graph[curr.node].get(i);

                    int u = e.src;
                    int v = e.dest;

                    if(dist[u] + e.wt < dist[v]){
                        dist[v] = dist[u] + e.wt;
                        pq.add(new pair(v, dist[v]));
                    }
                }
            }
        }

        //LOOP FOR PRINTING
        for(int i = 0; i<V; i++){
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        int V = 4;
        ArrayList<edge> graph[] = new ArrayList[V];

        createGraph(graph);
        dijkistras(graph, 0, V);
    }
}
 */




//**********GRAPH BY ARRAY-LIST ***********/


/*import java.util.ArrayList;

public class garphByArrayList {
    static class edge {
        int src;
        int dest;

        public edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    
    //MEMORY MADHE ARRAY LIST TAYAR KARNE
    public static void createGraph(ArrayList<edge> graph[]){

        for(int i = 0; i<graph.length; i++){            //-----> MEMORY MADHE LIST OF LIST'S TAYAR KARNE
            graph[i] = new ArrayList<edge>();
    }
            //MANUAL LINKAGE
            graph[0].add(new edge(0, 2));
            graph[1].add(new edge(1, 3));
            graph[1].add(new edge(1, 2));

            graph[2].add(new edge(2, 1));
            graph[2].add(new edge(2, 3));

            graph[3].add(new edge(3, 1));
            graph[3].add(new edge(3, 2));
        
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<edge>graph[] = new ArrayList[v];

        createGraph(graph); // build the graph

        for (int i = 0; i < v; i++) {
            System.out.print("Adj of " + i + ": ");
            for (edge e : graph[i]) {
                System.out.print("-> " + e.dest + " ");
            }
            System.out.println();
    }
}
}
 */




//**********KOSARAJU'S ALGORITHM ***********/


/*import java.util.ArrayList;
import java.util.Stack;

public class kosarajuAlgo {
    static class edge{
        int src;
        int dest;

        public edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    
    public static void createGraph(ArrayList<edge> graph[]){
        for(int i =0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

         graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));
        graph[0].add(new edge(0, 3));

        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 3));

        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 3));

        graph[3].add(new edge(3, 1));
        graph[3].add(new edge(3, 2));

    }


    //LOGIC FOR TOPOLOGICAL SORTING
    public static void topoSort(ArrayList<edge>graph[], int curr, boolean vis[], Stack<Integer> S){
        vis[curr] = true;
        for(int i  =0; i<graph[curr].size(); i++){
            edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topoSort(graph, e.dest, vis, S);
            }
        }
        S.push(curr);
    }

    //LOGIC FOR NORMAL DFS    
    public static void dfs(ArrayList<edge>graph[], int curr, boolean vis[]){

        vis[curr] = true;
        System.out.println(curr);
        for(int i = 0; i<graph[curr].size(); i++){
            edge e = graph[curr].get(i);

            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }

    //ACTUAL LOGIC FOR KOSARAJU'S ALGO
    public static void kosarajuAlgo(ArrayList<edge> graph[], int V){
        Stack<Integer> S = new Stack<>();       //NODES ULTE STORE KARAYCHA ARRAY
        boolean vis [] = new boolean[V];
        for(int i = 0; i<V; i++){
            if(!vis[i]){
                topoSort(graph, i, vis, S);
            }
        }

        //TRANSPOSE CHA LOGIC 
        ArrayList<edge> Transpose[] = (ArrayList<edge>[]) new ArrayList[V];
        //vis[i] = false;
        for(int i = 0; i<graph.length; i++){
            Transpose[i] = new ArrayList<>();
        }
        
        //
        for(int i = 0; i<V; i++){
            for(int j=0; j<graph[i].size(); j++){
                edge e = graph[i].get(j);
                Transpose[e.dest].add(new edge(e.dest, e.src));         //ULTI LINKAGE WALI CONDITION
            }
        }

        // reset visited for second pass
        vis = new boolean[V];

        System.out.println("Strongly Connected Components:");
        while(!S.isEmpty()){
            int curr = S.pop();
            if(!vis[curr]){
                dfs(graph, curr, vis);
                System.out.println();
            }
        }
    }

    public static void main(String[] args){
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<edge> graph[] = (ArrayList<edge>[]) new ArrayList[V];
        createGraph(graph);
        kosarajuAlgo(graph, V);
    }
}
 */





//**********MINIMUM SPANNING TREE BY PRIM'S ALGO (MST)***********/


/*import java.util.ArrayList;
import java.util.PriorityQueue;

public class MSTbyPrimsAlgo {
    static class edge{
        int src;
        int dest;
        int weight;
        public edge(int s, int d, int wt){
            this.src = s;
            this.dest = d;
            this.weight = wt;
        }
    }
    
    public static void createGraph(ArrayList<edge>graph[]){
        for (int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0, 1, 10));
        graph[0].add(new edge(0, 2, 15));
        graph[0].add(new edge(0, 3, 30));

        graph[1].add(new edge(1, 0, 10));
        graph[1].add(new edge(1, 3, 40));

        graph[2].add(new edge(2, 0, 15));
        graph[2].add(new edge(2, 3, 50));

        graph[3].add(new edge(3, 1, 40));
        graph[3].add(new edge(3, 2, 50));
    }


    //VALUES WEIGHT'S CHYA BASES VAR COMPARE KARNYASATHI
    public static class pair implements Comparable<pair> {
        int node;
        int cost;

        public pair(int n, int c){
            this.node = n;
            this.cost = c;

        }

            @Override
            public int compareTo(pair p2){
                return this.cost-p2.cost;
            }
        
        }

    //ACTUAL LOGIC FOR PRIM'S ALGO
    public static void primsAlgo(ArrayList<edge>graph[], int V){
        PriorityQueue<pair> pq =new PriorityQueue<>();      //NON MST NODES STORE KARNYASATHI
        boolean vis[] = new boolean[V];         //MST VALE NODES STORE KARNYASATHI
        pq.add(new pair(0, 0));

        int mstCost =  0;       //EDGES ADD KARTANA SATHI CHA VARIABLE

        while(!pq.isEmpty()){            //------> NON MST NODES ARRAY EMEPTY HOI PARYANT LOOP VANE
            pair curr = pq.remove();      //------> EK EK KARUN NODE BAHER KADHNE 
 
            if(!vis[curr.node]){            ////------> NODE VISIT KARVUN WEIGHT ADD KARUN GHENE
                vis[curr.node] = true;
                mstCost += curr.cost;

                //SAGLE NEIGHBOUR KADUN GHENE
                for(int i = 0; i<graph[curr.node].size(); i++){
                    edge e = graph[curr.node].get(i);
                    
                    if(!vis[e.dest]){
                        pq.add(new pair(e.dest, e.weight));
                    }
                }
            }   
        }
         System.out.println("min cost = " + mstCost); 
    }
    public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<edge>[] graph = new ArrayList[V];

        createGraph(graph);
        primsAlgo(graph, V);
    }
}

 */






//*************TARJANS-ALGORITHM *************// 

/*import java.util.ArrayList;

public class TarjansAlgo {
    static class edge {
        int src;
        int dest;

        public edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));
        graph[0].add(new edge(0, 3));

        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 3));

        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 3));

        graph[3].add(new edge(3, 1));
        graph[3].add(new edge(3, 2));
    }

    //ACTUAL DFS OF TARJAN'S ----> BRIDGE FINDING
    public static void dfs(ArrayList<edge> graph[], int curr, boolean vis[],
                           int dt[], int Ldt[], int low[], int parent, int time) {

        vis[curr] = true;
        dt[curr] = Ldt[curr] = low[curr] = ++time;   //TIME STAMP

        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);

            //PARENT NODE LA IGNORE KARNE
            if (e.dest == parent) {
                continue;
            }

            //NEIGH VISIT NA ASLYAS
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis, dt, Ldt, low, curr, time);  //DFS KARNE

                low[curr] = Math.min(low[curr], low[e.dest]);   //LOWEST TIME UPDATE

                //BRIDGE CONDITIONS
                if (dt[curr] < low[e.dest]) {
                    System.out.println("Bridge is : " + curr + " ------ " + e.dest);
                }
            }
            else {
                //Already visited neighbor → Back edge
                low[curr] = Math.min(low[curr], dt[e.dest]);
            }
        }
    }

    public static void getBridge(ArrayList<edge> graph[], int V) {
        int dt[] = new int[V];
        int Ldt[] = new int[V];
        int low[] = new int[V];

        boolean vis[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, vis, dt, Ldt, low, -1, 0);
            }
        }
    }

    public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<edge> graph[] = new ArrayList[V];
        
        createGraph(graph);
        getBridge(graph, V);
    }
}
 */