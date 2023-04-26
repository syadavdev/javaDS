package com.sandi.javaDS.graph;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GraphExample {

    List<LinkedList<Node>> graph;
    int v;

    public GraphExample(int nodes){
        v = nodes;
        graph = new ArrayList<>();
        for(int i = 0;i < v; i++){
            //graph.add(new ArrayList<>(v));
        }
    }

    public void addEdge(int u, int v){
        //graph.get(u).add(graph.get(v));
        //graph.get(v).add((Node) graph.get(u));
    }

    public void printGraph(){

    }

    public static void main(String...args){

        GraphExample graph = new GraphExample(5);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 3);
        graph.addEdge(0, 3);

    }

}

@Getter
@AllArgsConstructor
class Node {

    String name;
    Integer id;

}