package kbalad.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _200_NumberOfIslands {
    private static final List<int[]> DIRECTIONS = Arrays.asList(
            new int[] {0, 1},
            new int[] {0, -1},
            new int[] {1, 0},
            new int[] {-1, 0}
    );

    public int numIslands(char[][] grid) {
        int n = grid.length;
        if (n == 0) return 0;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    // bfs
                    Queue<int[]> toVisit = new LinkedList<>();
                    visited[i][j] = true;
                    toVisit.add(new int[]{i, j});
                    while (!toVisit.isEmpty()) {
                        int[] point = toVisit.poll();
                        int x = point[0];
                        int y = point[1];
                        for (int[] direction: DIRECTIONS) {
                            int dx = direction[0];
                            int dy = direction[1];
                            int nx = x + dx; int ny = y + dy;
                            if (nx < 0 || ny < 0 || nx >= n || ny >= m || visited[nx][ny]) {
                                continue;
                            }
                            if (grid[nx][ny] == '1') {
                                visited[nx][ny] = true;
                                toVisit.add(new int[]{nx, ny});
                            }
                        }
                    }
                    res++;
                }
            }
        }

        return res;
    }
}
