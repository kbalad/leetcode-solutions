package kbalad.graph;

import java.util.*;

public class _332_ReconstructItinerary {

    private final Map<String, List<String>> flightMap = new HashMap<>();
    private final Map<String, boolean[]> visitBitmap = new HashMap<>();
    private int flightsTotal = 0;
    private List<String> result = null;

    public List<String> findItinerary(List<List<String>> tickets) {
        buildMap(tickets);
        sortAndInitBitmap();

        flightsTotal = tickets.size();
        LinkedList<String> route = new LinkedList<>();
        route.add("JFK");

        backtrack(route);
        return result;
    }

    private void sortAndInitBitmap() {
        for (Map.Entry<String, List<String>> entry : flightMap.entrySet()) {
            String source = entry.getKey();
            List<String> dests = entry.getValue();

            Collections.sort(dests);
            visitBitmap.put(source, new boolean[dests.size()]);
        }
    }

    private void buildMap(List<List<String>> tickets) {
        for (List<String> ticket : tickets) {
            String source = ticket.get(0);
            String dest = ticket.get(1);

            flightMap.putIfAbsent(source, new ArrayList<>());
            flightMap.get(source).add(dest);
        }
    }

    private boolean backtrack(LinkedList<String> route) {
        // terminal state
        if (route.size() == flightsTotal + 1) {
            result = new ArrayList<>(route);
            return true;
        }

        String source = route.getLast();
        boolean[] bitmap = visitBitmap.get(source);

        // check if we have flights from last airport
        if (!flightMap.containsKey(source))
            return false;

        List<String> routesFromSource = flightMap.get(source);
        for (int i = 0; i < routesFromSource.size(); i++) {
            String dest = routesFromSource.get(i);
            if (!bitmap[i]) {
                bitmap[i] = true;
                route.add(dest);
                boolean ret = this.backtrack(route);
                route.pollLast();
                bitmap[i] = false;

                if (ret)
                    return true;
            }
        }

        return false;
    }
}
