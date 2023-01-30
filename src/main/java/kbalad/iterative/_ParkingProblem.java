package kbalad.iterative;

public class _ParkingProblem {

    // O(n) where n is timeSpans.length
    public int findParkingLots(int[][] timeSpans) {
        int[] carsAtTheTime = new int[24];
        for (int[] span : timeSpans) {
            for (int j = span[0]; j <= span[1]; j++) carsAtTheTime[j]++;
        }
        int res = 0;
        for (int i : carsAtTheTime) {
            res = Math.max(res, i);
        }
        return res;
    }
}
