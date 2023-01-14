package kbalad.stack;

import java.util.*;

public class _133_CloneGraph {
    public Node cloneGraph(Node originalNode) {
        if (originalNode == null) return null;
        Map<Node, Node> originalToClonedNodes = new HashMap<>();
        Deque<Node> stack = new LinkedList<>();
        Set<Node> visited = new HashSet<>();

        Node clonedNode = new Node(originalNode.val, new ArrayList<>());
        stack.push(originalNode);
        originalToClonedNodes.put(originalNode, clonedNode);
        visited.add(originalNode);

        while (!stack.isEmpty()) {
            Node original = stack.pop();
            for (Node neighbour: original.neighbors) {
                Node clonedNeighbour;
                if (!visited.contains(neighbour)) {
                    clonedNeighbour = new Node(neighbour.val, new ArrayList<>());
                    originalToClonedNodes.put(neighbour, clonedNeighbour);
                    visited.add(neighbour);
                    stack.push(neighbour);
                } else {
                    clonedNeighbour = originalToClonedNodes.get(neighbour);
                }
                originalToClonedNodes.get(original).neighbors.add(clonedNeighbour);
            }
        }

        return clonedNode;
    }

    static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
