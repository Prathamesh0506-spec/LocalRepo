//***** 
// JAVA PROGRAMS FILE FOR DESIGN & ANALYSIS OF ALGORITHM -> CLOUD


/********************************************-> UNIT-ADVANCED_GRAPH-ALGORITHMS <-********************************************/


//**********ALL PATHS IN GRAPH BASIC PROGRAMM ***********/

import java.util.ArrayList;

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
