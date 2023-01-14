package kbalad.graph;

import java.util.*;

public class _6106_CountUnreachablePAI {
    private Set<Integer> visited;
    private Map<Integer, Set<Integer>> graph;

    public long countPairs(int n, int[][] edges) {
        graph = new HashMap<>(100000);
        visited = new HashSet<>(100000);

        for (int[] edge: edges) {
            int k = edge[0];
            int v = edge[1];
            Set<Integer> nodes = graph.get(k);
            if (nodes == null) {
                nodes = new HashSet<>();
            }
            nodes.add(v);
            graph.put(k ,nodes);

            k = edge[1];
            v = edge[0];
            nodes = graph.get(k);
            if (nodes == null) {
                nodes = new HashSet<>();
            }
            nodes.add(v);
            graph.put(k ,nodes);
        }

        List<Long> clusters = new ArrayList<>();
        long ones = 0;
        for (int i = 0; i < n; i++) {
            if (!visited.contains(i)) {
                long v = clusterSizeBFS(i);
                if (v == 1) {
                    ones++;
                } else {
                    clusters.add(v);
                }
            }
        }

        long res = 0;
        for (int i = 0; i < clusters.size() - 1; i++) {
            for (int j = i + 1; j < clusters.size(); j++) {
                long v = clusters.get(i) * 1L * clusters.get(j);
                res += v;
            }
        }
        for (Long v : clusters) {
            res += v * ones;
        }
        if (ones > 0) {
            res += ones * (ones - 1) / 2;
        }
        return res;
    }

    private long clusterSizeBFS(int node) {
        LinkedList<Integer> toVisit = new LinkedList<>();
        toVisit.add(node);

        long cnt = 0;
        while (!toVisit.isEmpty()) {
            int nextNode = toVisit.pop();
            if (visited.contains(nextNode))
                continue;
            visited.add(nextNode);
            cnt++;

            Set<Integer> values = graph.get(nextNode);
            if (values == null || values.isEmpty()) continue;
            for (Integer nextToProcess: values) {
                if (!visited.contains(nextToProcess)) {
                    toVisit.push(nextToProcess);
                }
            }
        }
        return cnt;
    }
}
