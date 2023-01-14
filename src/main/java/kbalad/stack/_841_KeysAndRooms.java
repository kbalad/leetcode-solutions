package kbalad.stack;

import java.util.*;

public class _841_KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        Deque<Integer> stack = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        visited.add(0);
        stack.push(0);
        while (!stack.isEmpty()) {
            int e = stack.pop();
            for (int neighbour: rooms.get(e)) {
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    stack.push(neighbour);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (!visited.contains(i)) {
                return false;
            }
        }

        return true;
    }
}
