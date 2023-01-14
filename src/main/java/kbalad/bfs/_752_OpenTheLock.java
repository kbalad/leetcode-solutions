package kbalad.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _752_OpenTheLock {
    private static final List<int[]> MOVES = Arrays.asList(
            new int[] {0, 0, 0, 1},
            new int[] {0, 0, 0, -1},
            new int[] {0, 0, 1, 0},
            new int[] {0, 0, -1, 0},
            new int[] {0, 1, 0, 0},
            new int[] {0, -1, 0, 0},
            new int[] {1, 0, 0, 0},
            new int[] {-1, 0, 0, 0}
    );
    private static final int TARGET = 0;
    private static final int DEADEND = -2;
    private static final int EMPTY = -1;

    public int openLock(String[] deadends, String target) {
        int dim = 10;
        int[][][][] lock = new int[dim][dim][dim][dim];

        // fill empty
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                for (int k = 0; k < dim; k++) {
                    Arrays.fill(lock[i][j][k], -1);
                }
            }
        }

        // fill deadends
        for (String deadend: deadends) {
            char[] vc = deadend.toCharArray();
            int[] v = new int[4];
            for (int i = 0; i < 4; i++) {
                v[i] = vc[i] - '0';
            }
            lock[v[0]][v[1]][v[2]][v[3]] = DEADEND;
        }

        // fill target
        char[] vc = target.toCharArray();
        int[] vtar = new int[4]; // target vector
        for (int i = 0; i < 4; i++) {
            vtar[i] = vc[i] - '0';
        }
        lock[vtar[0]][vtar[1]][vtar[2]][vtar[3]] = TARGET;

        int v = lock[0][0][0][0];
        if (v == DEADEND) return -1;
        if (v == TARGET) return 0;

        // bfs
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{vtar[0], vtar[1], vtar[2], vtar[3]});
        while (!q.isEmpty()) {
            int[] s = q.poll();
            for (int[] dir: MOVES) {
                int[] ns = new int[4];
                for (int i = 0; i < 4; i++) {
                    int newV = dir[i] + s[i];
                    if (newV == -1) newV = 9;
                    else if (newV == 10) newV = 0;
                    ns[i] = newV;
                }
                if (lock[ns[0]][ns[1]][ns[2]][ns[3]] != EMPTY)
                    continue;
                lock[ns[0]][ns[1]][ns[2]][ns[3]] = lock[s[0]][s[1]][s[2]][s[3]] + 1;
                if (ns[0] == 0 && ns[1] == 0 && ns[2] == 0 && ns[3] == 0) {
                    return lock[ns[0]][ns[1]][ns[2]][ns[3]];
                }
                q.add(new int[]{ns[0], ns[1], ns[2], ns[3]});
            }
        }

        v = lock[0][0][0][0];
        return v;
    }

}
