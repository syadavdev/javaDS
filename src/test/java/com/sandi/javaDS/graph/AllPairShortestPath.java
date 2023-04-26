package com.sandi.javaDS.graph;

public class AllPairShortestPath {

    static final int INF = 999;

    public static void main(String...args){
         /* Let us create the following weighted graph
           10
        (0)------->(3)
        |         /|\
        5 |          |
        |          | 1
        \|/         |
        (1)------->(2)
           3           */
        int graph[][] = { {0,   5,  INF, 10},
                {INF, 0,   3, INF},
                {INF, INF, 0,   1},
                {INF, INF, INF, 0}
        };

        int i, j, k;

        for(k = 0; k < 4; k++){
            for(i = 0; i < 4; i++){
                for(j = 0; j < 4; j++) {
                    if(graph[i][j] > (graph[i][k] + graph[k][j]))
                        graph[i][j] = graph[i][k] + graph[k][j];
                }
            }
        }

        printSolution(graph);
    }

    static void printSolution(int dist[][])
    {
        System.out.println("The following matrix shows the shortest "+
                "distances between every pair of vertices");
        for (int i=0; i<4; ++i)
        {
            for (int j=0; j<4; ++j)
            {
                if (dist[i][j]==INF)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
