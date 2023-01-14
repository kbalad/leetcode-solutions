package kbalad.bfs;

import java.util.*;

public class _286_WallsAndGates {
    private static final int GATE = 0;
    private static final int EMPTY = Integer.MAX_VALUE;
    private static final List<int[]> DIRECTIONS = Arrays.asList(
            new int[] {0, 1},
            new int[] {0, -1},
            new int[] {1, 0},
            new int[] {-1, 0}
    );

    public void wallsAndGates(int[][] rooms) {
        int n = rooms.length;
        if (n == 0) return;
        int m = rooms[0].length;

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (rooms[i][j] == GATE)
                    queue.add(new int[]{i, j});
            }
        }

        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int row = point[0];
            int col = point[1];
            for (int[] direction : DIRECTIONS) {
                int r = direction[0] + row;
                int c = direction[1] + col;
                if (r < 0 || c < 0 || r >= n || c >= m || rooms[r][c] != EMPTY) {
                    continue;
                }
                rooms[r][c] = rooms[row][col] + 1;
                queue.add(new int[]{r, c});
            }
        }
    }
}
