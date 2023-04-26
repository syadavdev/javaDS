package com.sandi.javaDS.graph;

import java.util.Arrays;

public class MultistageGraph {

    public static void main(String...args){

        int[][] graph = new int[][]{
                {0, 1, 2, 5, 0, 0, 0, 0},
                {0, 0, 0, 0, 4, 11, 0, 0},
                {0, 0, 0, 0, 9, 5, 16, 0},
                {0, 0, 0, 0, 0, 0, 2, 0},
                {0, 0, 0, 0, 0, 0, 0, 18},
                {0, 0, 0, 0, 0, 0, 0, 13},
                {0, 0, 0, 0, 0, 0, 0, 2}};

        System.out.println("Multistage graph shortest path : " + shortestRoute(graph, 8));
    }

    static int shortestRoute(int graph[][], int n){
        int dist[] = new int[8];

        dist[n - 1] = 0;

        for(int i = n - 2; i >= 0; i--) {
            int min = Integer.MAX_VALUE;
            for(int j = i; j < n; j++){
                if(graph[i][j] != 0 && (graph[i][j] + dist[j]) < min){
                    min = graph[i][j] + dist[j];
                    dist[i] = min;
                }
            }
        }

        Arrays.stream(dist).forEach(System.out::println);
        return dist[0];
    }

}
