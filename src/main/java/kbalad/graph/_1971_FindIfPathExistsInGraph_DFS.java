package kbalad.graph;

public class _1971_FindIfPathExistsInGraph_DFS {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        UnionFind uf = new UnionFind(n);
        for (int[] edge : edges) {
            uf.union(edge[0], edge[1]);
        }
        return uf.find(source) == uf.find(destination);
    }

    private static class UnionFind {
        int[] root;
        int[] rank;

        public UnionFind(int n) {
            root = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                root[i] = i;
                rank[i] = 1;
            }
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                if (rank[rootX] == rank[rootY]) {
                    root[rootY] = rootX;
                    rank[rootX]++;
                } else if (rank[rootX] > rank[rootY]) {
                    root[rootY] = rootX;
                } else {
                    root[rootX] = rootY;
                }
            }
        }

        public int find(int a) {
            if (a == root[a]) return a;
            return root[a] = find(root[a]);
        }
    }
}
