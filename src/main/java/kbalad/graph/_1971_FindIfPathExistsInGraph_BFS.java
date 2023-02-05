package kbalad.graph;

import java.util.*;

public class _1971_FindIfPathExistsInGraph_BFS {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> seen = new HashSet<>();
        seen.add(source);
        queue.add(source);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            if (v == destination) {
                return true;
            }
            List<Integer> neighbours = adj.get(v);
            for (Integer neighbour : neighbours) {
                if (seen.contains(neighbour)) {
                    continue;
                }
                seen.add(neighbour);
                queue.add(neighbour);
            }
        }
        return false;
    }
}
