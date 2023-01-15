package kbalad.graph;

public class _547_NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        UnionFind unionFind = new UnionFind(n);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    unionFind.union(i, j);
                }
            }
        }
        return unionFind.clustersNum();
    }

    private static class UnionFind {
        private final int[] root;
        private final int[] rank;
        private int clusters;

        // O(N)
        public UnionFind(int n) {
            root = new int[n];
            rank = new int[n];
            clusters = n;
            for (int i = 0; i < n; i++) {
                root[i] = i;
                rank[i] = 1;
            }
        }

        // O(N)
        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                assignNewRootByRank(rootX, rootY);
                clusters--;
            }
        }

        // O(1)
        private void assignNewRootByRank(int rootX, int rootY) {
            int rx = rank[rootX];
            int ry = rank[rootY];
            if (rx == ry) {
                root[rootY] = rootX;
                rank[rootX]++;
            } else if (rx < ry) {
                root[rootY] = rootX;
            } else {
                root[rootX] = rootY;
            }
        }

        // O(N) - worst case when traversing first time
        public int find(int i) {
            if (i == root[i]) {
                return i;
            }
            return root[i] = find(root[i]);
        }

        public int clustersNum() {
            return clusters;
        }
    }
}
