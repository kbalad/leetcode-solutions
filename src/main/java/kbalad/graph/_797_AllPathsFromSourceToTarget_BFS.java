package kbalad.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _797_AllPathsFromSourceToTarget_BFS {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        Queue<List<Integer>> queuePath = new LinkedList<>();
        List<Integer> start = List.of(0);
        queuePath.add(start);
        while (!queuePath.isEmpty()) {
            List<Integer> pathAndElem = queuePath.poll();
            int cur = pathAndElem.get(pathAndElem.size() - 1);
            if (cur == graph.length - 1) {
                res.add(pathAndElem);
                continue;
            }
            int[] neighbours = graph[cur];
            for (int neighbour : neighbours) {
                List<Integer> newPath = new ArrayList<>(pathAndElem);
                newPath.add(neighbour);
                queuePath.add(newPath);
            }
        }
        return res;
    }

}
