package com.neetcode.graphs;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {
    // SC --> O(N) + O(N)(visited) + O(N) == O(N)
    // TC -> O(N) + O(2E)
    private static void dfs(int node, boolean[] visited, List<List<Integer>> adjList, List<Integer> result) {

        visited[node] = true;
        result.add(node);

        for(Integer i : adjList.get(node)){
            if(!visited[i]){
                dfs(i, visited, adjList, result);
            }
        }
    }

    public static List<Integer> dfsOfGraph(int nodes, List<List<Integer>> adjList){

        boolean[] visited = new boolean[nodes];
        List<Integer> result = new ArrayList<>();
        dfs(0, visited, adjList, result);
        return result;
    }


    public static void main(String[] args) {
        List<List<Integer>> adjList = Graphs.createAdjacencyList(5, new int[][]{{0, 2}, {0,
                1}, {0, 3}, {2, 4}});
        System.out.println(dfsOfGraph(5, adjList));
    }
}
