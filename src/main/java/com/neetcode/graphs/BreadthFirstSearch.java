package com.neetcode.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {

    // SC --> O(3N) = O(N) 3N -> {visited, queue, result}
    // TC --> O(N) (outer while loop for every node) + O(2E) (inner for loop that runs on every
    // neighbour of every node meaning all degrees.. which is 2*E)
    public static List<Integer> bfsOfGraph(int nodes, List<List<Integer>> adjList){

        // Create the result list for bfs
        List<Integer> result = new ArrayList<>();

        // Create a boolean array to track which nodes have been visited
        boolean[] visited = new boolean[nodes + 1];

        Queue<Integer> queue = new LinkedList<>();

        // Add the starting node in the queue and mark it being visited
        queue.add(1);
        visited[1] = true;

        // Keep going until the queue becomes empty
        while(!queue.isEmpty()){

            // Remove the element in the front of the queue
            Integer node = queue.poll();

            // Add that element to the bfs result
            result.add(node);

            // Fetch the neighbours of that node from the adj list and for all non visited nodes,
            // add them to the queue and mark them visited.
            for(Integer i : adjList.get(node)){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> adjList = Graphs.createAdjacencyList(8, new int[][]{{1, 2}, {1,
                3}, {1, 4}, {2, 5}, {3, 6}, {4, 7}, {7, 8}});
        System.out.println(bfsOfGraph(8, adjList));
    }
}
