package kbalad.bfs;

import java.util.*;

public class _305_NumberOfIslands2 {

    private final int[][] moves = {
            {1, 0},
            {0, 1},
            {-1, 0},
            {0, -1},
    };

    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        int[][] a = new int[m][n];
        int islandCnt = 0;
        int nextIslandColor = 1;
        List<Integer> islandsCntOnEachStep = new ArrayList<>(positions.length);
        for (int[] pos : positions) {

            if (a[pos[0]][pos[1]] != 0) {
                islandsCntOnEachStep.add(islandCnt);
                continue;
            }

            // find min color number
            int minNeighbourColor = Integer.MAX_VALUE;
            for (int[] move: moves) {
                int newRow =  pos[0] + move[0];
                int newCol = pos[1] + move[1];
                if (isOutOfBoundaries(newRow, newCol, m, n)) {
                    continue;
                }
                int color = a[newRow][newCol];
                if (color != 0) {
                    minNeighbourColor = Math.min(minNeighbourColor, color);
                }
            }
            // if no neighbours
            if (minNeighbourColor == Integer.MAX_VALUE) {
                islandCnt++;
                a[pos[0]][pos[1]] = nextIslandColor++;
                islandsCntOnEachStep.add(islandCnt);
                continue;
            }

            // connect with neighbours
            Set<Integer> recoloredColors = new HashSet<>();
            for (int[] move: moves) {
                int row =  pos[0] + move[0];
                int col = pos[1] + move[1];
                if (isOutOfBoundaries(row, col, m, n)) {
                    continue;
                }

                int color = a[row][col];
                if (color == 0) continue;
                recoloredColors.add(color);
                floodFill(a, minNeighbourColor, color, row, col);
            }
            islandCnt -= recoloredColors.size() - 1;

            // color the pos cell
            a[pos[0]][pos[1]] = minNeighbourColor;
            islandsCntOnEachStep.add(islandCnt);
        }
        return islandsCntOnEachStep;
    }

    private void floodFill(int[][] a, int newColor, int curColor, int startRow, int startCol) {
        if (newColor == curColor) {
            return;
        }
        LinkedList<int[]> toColor = new LinkedList<>();
        a[startRow][startCol] = newColor;
        toColor.add(new int[]{startRow, startCol});
        while (!toColor.isEmpty()) {
            int[] cur = toColor.pop();
            // traverse neighbours
            for (int[] move : moves) {
                int row = cur[0] + move[0];
                int col = cur[1] + move[1];
                if (isOutOfBoundaries(row, col, a.length, a[0].length)) continue;
                if (a[row][col] == curColor) {
                    a[row][col] = newColor;
                    toColor.add(new int[]{row, col});
                }
            }
        }
    }

    private boolean isOutOfBoundaries(int r, int c, int m, int n) {
        return (r >= m || r < 0 || c >= n || c < 0);
    }
}
