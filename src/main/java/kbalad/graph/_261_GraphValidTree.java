package kbalad.graph;

public class _261_GraphValidTree {
    public boolean validTree(int n, int[][] edges) {
        UnionFind uf = new UnionFind(n);
        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];
            if (uf.isConnected(x, y)) {
                return false;
            }
            uf.union(x, y);
        }
        return uf.clusterNum == 1;
    }

    private static class UnionFind {
        private final int[] root;
        private final int[] rank;
        private int clusterNum;

        public UnionFind(int n) {
            root = new int[n];
            rank = new int[n];
            clusterNum = n;
            for (int i = 0; i < n; i++) {
                root[i] = i;
                rank[i] = 1;
            }
        }

        public void union(int x, int y) {
            int rx = find(x);
            int ry = find(y);
            if (rx != ry) {
                int kx = rank[rx];
                int ky = rank[ry];
                if (kx == ky) {
                    root[ry] = rx;
                    rank[rx]++;
                } else if (kx < ky) {
                    root[rx] = ry;
                } else {
                    root[ry] = rx;
                }
                clusterNum--;
            }
        }

        public int find(int i) {
            if (i == root[i]) {
                return i;
            }
            return root[i] = find(root[i]);
        }

        public boolean isConnected(int x, int y) {
            return find(x) == find(y);
        }

        public int getClusterNum() {
            return clusterNum;
        }
    }
}
