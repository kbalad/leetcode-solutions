package kbalad.graph;

import java.util.Arrays;
import java.util.Comparator;

public class _1101_TheEarliestMomentWhenEveryoneBecomeFriends {
    public int earliestAcq(int[][] logs, int n) {
        Arrays.sort(logs, Comparator.comparingInt(o -> o[0]));

        UnionFind uf = new UnionFind(n);
        for (int[] log : logs) {
            uf.union(log[1], log[2]);
            if (uf.clusters == 1)
                return log[0];
        }
        return -1;
    }

    private static class UnionFind {
        private final int[] root;
        private final int[] rank;
        private int clusters;

        public UnionFind(int n) {
            root = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                root[i] = i;
                rank[i] = 1;
            }
            clusters = n;
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                int rankX = rank[rootX];
                int rankY = rank[rootY];
                if (rankX == rankY) {
                    root[rootY] = rootX;
                    rank[rootX]++;
                } else if (rankX < rankY) {
                    root[rootX] = rootY;
                } else {
                    root[rootY] = rootX;
                }
                clusters--;
            }
        }

        public int find(int i) {
            if (i == root[i])
                return i;
            return root[i] = find(root[i]);
        }
    }
}
