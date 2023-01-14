package kbalad.dp;

import java.util.Arrays;

public class _1335_MinimumDifficultyOfAJobSchedule_TopBottom {
    int[] jobs; int n;
    int d;
    int[][] mem;
    int[] hardestJobRemaining;

    public int minDifficulty(int[] jobDifficulty, int d) {
        jobs = jobDifficulty; n = jobs.length;
        this.d = d;
        if (n < d) {
            return -1;
        }
        hardestJobRemaining = new int[n];
        int hardestJob = 0;
        for (int i = n - 1; i >= 0; i--) {
            hardestJob = Math.max(hardestJob, jobDifficulty[i]);
            hardestJobRemaining[i] = hardestJob;
        }

        mem = new int[n][d + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(mem[i], -1);
        }

        return dp(0, 1);
    }

    private int dp(int i, int day) { // i is current job
        if (d == day) {
            return hardestJobRemaining[i];
        }
        if (mem[i][day] == -1) {
            int min = Integer.MAX_VALUE;
            int hardest = 0;
            for (int k = i; k < n - (d - day); k++) {
                hardest = Math.max(hardest, jobs[k]);
                min = Math.min(min, hardest + dp(k + 1, day + 1));
            }
            mem[i][day] = min;
        }
        return mem[i][day];
    }
}
