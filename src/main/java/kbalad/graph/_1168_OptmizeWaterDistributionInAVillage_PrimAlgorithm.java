package kbalad.graph;

import java.util.*;

public class _1168_OptmizeWaterDistributionInAVillage_PrimAlgorithm {
    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        // graph
        List<List<Edge>> graph = new ArrayList<>(n + 1);
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }
        // set of included nodes
        Set<Integer> mstSet = new HashSet<>(n);
        // heap of edges sorted by road cost/weight
        PriorityQueue<Edge> heap = new PriorityQueue<>(n, Comparator.comparingInt(e -> e.weight));

        // fill the graph with virtual node (well in the village)
        for (int i = 0; i < wells.length; i++) {
            int dest = i + 1;
            int weight = wells[i];

            Edge virtualEdge = new Edge(dest, weight);
            graph.get(0).add(virtualEdge);
            heap.add(virtualEdge);
        }

        // fill the graph with undirected edges
        for (int[] pipe : pipes) {
            int a = pipe[0];
            int b = pipe[1];
            int w = pipe[2];

            graph.get(a).add(new Edge(b, w));
            graph.get(b).add(new Edge(a, w));
        }

        // as there should be some well add 0 virtual node to MST
        mstSet.add(0);
        int mstWeight = 0;
        // build SMT using Prim's algorithm
        while (mstSet.size() != n + 1) {
            Edge edge = heap.poll();
            if (edge == null) throw new IllegalStateException("not reachable");
            Integer dest = edge.dest;
            if (mstSet.contains(dest)) {
                continue;
            }

            mstSet.add(dest);
            mstWeight += edge.weight;

            // add neighbours
            List<Edge> edgesToNeighbours = graph.get(dest);
            for (Edge e : edgesToNeighbours) {
                int node = e.dest;
                if (!mstSet.contains(node)) {
                    heap.add(e);
                }
            }
        }

        // return cost of MSG
        return mstWeight;
    }

    private static final class Edge {
        Integer dest;
        Integer weight;

        public Edge(Integer dest, Integer weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }
}
