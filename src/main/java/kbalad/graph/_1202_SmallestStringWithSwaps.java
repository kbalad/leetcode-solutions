package kbalad.graph;

import java.util.*;

public class _1202_SmallestStringWithSwaps {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        UnionFind uf = new UnionFind(s.length());
        for (List<Integer> pair : pairs) {
            uf.union(pair.get(0), pair.get(1));
        }

        // form set
        int[] roots = uf.getRoots();
        Map<Integer, List<Integer>> rootToComponent = new HashMap<>();
        for (int i = 0; i < roots.length; i++) {
            int root = roots[i];
            rootToComponent.putIfAbsent(root, new ArrayList<>());
            rootToComponent.get(root).add(i);
        }

        // string to store the answer
        char[] smallestString = new char[s.length()];
        // iterate over the components
        for (List<Integer> componentIndices : rootToComponent.values()) {
            // sort the chars in component
            List<Character> chars = new ArrayList<>();
            for (Integer index : componentIndices) {
                char c = s.charAt(index);
                chars.add(c);
            }
            Collections.sort(chars);

            // put characters from component on positions
            for (int i = 0; i < componentIndices.size(); i++) {
                char c = chars.get(i);
                int pos = componentIndices.get(i);
                smallestString[pos] = c;
            }
        }
        return new String(smallestString);
    }

    private static class UnionFind {
        private final int[] root;
        private final int[] rank;

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
                } else if (rank[rootX] < rank[rootY]) {
                    root[rootX] = rootY;
                } else {
                    root[rootY] = rootX;
                }
            }
        }

        public int find(int i) {
            if (i == root[i])
                return i;
            return root[i] = find(root[i]);
        }

        public int[] getRoots() {
            int[] out = new int[root.length];
            for (int i = 0; i < root.length; i++) {
                out[i] = find(i);
            }
            return out;
        }
    }
}
