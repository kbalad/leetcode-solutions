package kbalad.graph;

import java.util.*;

public class _1168_OptmizeWaterDistributionInAVillage_KruskalAlgorithm {
    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        // build all edges sorted by weight
        PriorityQueue<Edge> allEdges = new PriorityQueue<>(n + pipes.length, Comparator.comparingInt(Edge::getW));
        for (int i = 0; i < n; i++) {
            allEdges.add(new Edge(0, i + 1, wells[i]));
        }
        for (int[] pipe : pipes) {
            allEdges.add(new Edge(pipe));
        }

        // iterate over all edges while we won't get one cluster (MST)
        UnionFind mst = new UnionFind(n + 1); // as we have virt node --> +1
        while (mst.clusters != 1) {
            Edge e = allEdges.poll();
            if (e == null) {
                throw new IllegalStateException("not reachable");
            }
            if (mst.areConnected(e.a, e.b)) {
                continue;
            }
            mst.union(e.a, e.b, e.w);
        }
        return mst.cost;
    }

    private static final class Edge {
        int a;
        int b;
        int w;

        public Edge(int a, int b, int w) {
            this.a = a;
            this.b = b;
            this.w = w;
        }

        public Edge(int[] pipe) {
            this.a = pipe[0];
            this.b = pipe[1];
            this.w = pipe[2];
        }

        public int getW() {
            return w;
        }
    }

    private static final class UnionFind {
        int[] root;
        int[] rank;
        int cost;
        int clusters;

        public UnionFind(int n) {
            root = new int[n];
            rank = new int[n];
            clusters = n;
            for (int i = 0; i < n; i++) {
                root[i] = i;
                rank[i] = 1;
            }
        }

        public boolean areConnected(int x, int y) {
            return find(x) == find(y);
        }

        public int find(int a) {
            if (a == root[a]) {
                return a;
            }
            return root[a] = find(root[a]);
        }

        public void union(int a, int b, int w) {
            int rootA = find(a);
            int rootB = find(b);
            if (rootA != rootB) {
                int rankA = rank[rootA];
                int rankB = rank[rootB];
                if (rankA == rankB) {
                    root[rootB] = rootA;
                    rank[rootA] += 1;
                } else if (rankA > rankB) {
                    root[rootB] = rootA;
                } else {
                    root[rootA] = rootB;
                }
                cost += w;
                clusters -= 1;
            }
        }
    }
}
