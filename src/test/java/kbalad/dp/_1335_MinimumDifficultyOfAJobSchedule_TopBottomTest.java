package kbalad.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class _1335_MinimumDifficultyOfAJobSchedule_TopBottomTest {

    @Test
    public void minDifficulty() {
        int d = 4;
        int[] jobs = new int[] { 9, 9, 9 };
        int exp = -1;
        int act = new _1335_MinimumDifficultyOfAJobSchedule_TopBottom().minDifficulty(jobs, d);
        assertEquals(exp, act);
    }

    @Test
    public void minDifficulty2() {
        int d = 3;
        int[] jobs = new int[] { 1, 1, 1 };
        int exp = 3;
        int act = new _1335_MinimumDifficultyOfAJobSchedule_TopBottom().minDifficulty(jobs, d);
        assertEquals(exp, act);
    }

    @Test
    public void minDifficulty3() {
        int d = 3;
        int[] jobs = new int[] { 7, 1,  7, 1, 7, 1  };
        int exp = 15;
        int act = new _1335_MinimumDifficultyOfAJobSchedule_TopBottom().minDifficulty(jobs, d);
        assertEquals(exp, act);
    }
}