package kbalad.graph;

import java.util.*;

public class _797_AllPathsFromSourceToTarget {
    int[][] graph;
    List<List<Integer>> res;

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.graph = graph;
        res = new ArrayList<>();
        List<Integer> path = new ArrayList<>(graph.length);
        path.add(0);
        dfs(path, 0);
        return res;
    }

    private void dfs(List<Integer> path, int cur) {
        if (cur == graph.length - 1) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int neighbour : graph[cur]) {
            path.add(neighbour);
            dfs(path, neighbour);
            path.remove(path.size() - 1);
        }
    }
}
