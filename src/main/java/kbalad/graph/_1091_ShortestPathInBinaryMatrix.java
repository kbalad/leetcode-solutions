package kbalad.graph;

import java.util.*;

public class _1091_ShortestPathInBinaryMatrix {
    private final int[][] moves = {
            {-1, 0},
            {1, 0},
            {0, 1},
            {0, -1},
            {1, 1},
            {1, -1},
            {-1, 1},
            {-1, -1},
    };

    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] != 0) {
             return -1;
        }
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        Queue<int[]> toVisit = new LinkedList<>();
        int[] start = {0, 0};
        visited[0][0] = true;
        toVisit.add(start);

        int pathLen = 1;
        while (!toVisit.isEmpty()) {
            Queue<int[]> nextToVisit = new LinkedList<>();
            while (!toVisit.isEmpty()) {
                int[] e = toVisit.poll();
                if (e[0] == n - 1 && e[1] == n - 1) {
                    return pathLen;
                }
                for(int[] move : moves) {
                    int nx = e[0] + move[0];
                    int ny = e[1] + move[1];
                    if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                    if (!visited[nx][ny] && grid[nx][ny] == 0) {
                        visited[nx][ny] = true;
                        nextToVisit.add(new int[]{nx, ny});
                    }
                }
            }
            pathLen++;
            toVisit = nextToVisit;
        }
        return -1;
    }
}
