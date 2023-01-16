package kbalad.graph;

public class _323_NumberOfConnectedComponents {
    public int countComponents(int n, int[][] edges) {
        UnionFind uf = new UnionFind(n);
        for (int[] edge : edges) {
            uf.union(edge[0], edge[1]);
        }
        return uf.components();
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
            int rx = find(x);
            int ry = find(y);
            if (rx != ry) {
                int kx = rank[rx];
                int ky = rank[ry];
                if (kx == ky) {
                    root[ry] = root[rx];
                    rank[rx]++;
                } else if (kx < ky) {
                    root[rx] = root[ry];
                } else {
                    root[ry] = root[rx];
                }
                clusters--;
            }
        }

        public int find(int i) {
            if (i == root[i]) {
                return i;
            }
            return find(root[i] = find(root[i]));
        }

        public int components() {
            return clusters;
        }
    }
}
