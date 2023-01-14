package kbalad.stack;

public class _739_DailyTemperatures_2 {
    /* It is implementation without additional space: O(1) - only answer */
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        int hottest = 0;

        for (int curDay = n - 1; curDay >= 0; curDay--) {
            if (temperatures[curDay] >= hottest) {
                hottest = temperatures[curDay];
                continue;
            }

            int nextDay = curDay + 1;
            while (temperatures[curDay] >= temperatures[nextDay]) {
                nextDay += res[nextDay];
            }
            res[curDay] = nextDay - curDay;
        }
        return res;
    }
}
