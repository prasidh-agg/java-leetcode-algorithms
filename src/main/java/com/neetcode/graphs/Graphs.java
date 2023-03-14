package com.neetcode.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graphs {

    public static List<List<Integer>> createAdjacencyList(int numNodes, int[][] edges) {

        List<List<Integer>> adjacencyList = new ArrayList<>();

        // Initialize the adjacency list with empty lists for each node
        for (int i = 0; i <= numNodes; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        // Add the edges to the adjacency list
        for (int[] edge : edges) {
            int node1 = edge[0];
            int node2 = edge[1];

            adjacencyList.get(node1).add(node2);
            adjacencyList.get(node2).add(node1);
        }

        return adjacencyList;
    }

    //adjacency matrix. [n + 1][n + 1]. O(N^2) space (Method not really used because of bad space)

    /*
    adjacency list. List<List<Integer>>. Add n + 1 lists to this list
    every array list contains its neighbours.. in any order. Space complexity is O(2*M)
    */
    public static void main(String[] args) {

        int n = 4, m = 4;

        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= n + 1; i++) {
            adjList.add(new ArrayList<>());
        }

        int[][] adjMat = new int[n + 1][n + 1];

        //edge 1 --> 2
        adjMat[1][2] = 1;
        adjMat[2][1] = 1;

        //edge 3 --> 4
        adjMat[3][4] = 1;
        adjMat[4][3] = 1;

        //edge 2 --> 3
        adjMat[2][3] = 1;
        adjMat[3][2] = 1;

        //edge 1 --> 4
        adjMat[1][4] = 1;
        adjMat[4][1] = 1;

        //edge 1 --> 2
        adjList.get(1).add(2);
        adjList.get(2).add(1);

        //edge 3 --> 4
        adjList.get(3).add(4);
        adjList.get(4).add(3);

        //edge 2 --> 3
        adjList.get(2).add(3);
        adjList.get(3).add(2);

        //edge 1 --> 4
        adjList.get(1).add(4);
        adjList.get(4).add(1);

        System.out.println(Arrays.deepToString(adjMat));
        System.out.println(adjList);
    }
}
