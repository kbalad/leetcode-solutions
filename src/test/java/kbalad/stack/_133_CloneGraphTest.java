package kbalad.stack;

import kbalad.stack._133_CloneGraph.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class _133_CloneGraphTest {

    @Test
    public void cloneGraph() {
        Node n3 = new Node(3, new ArrayList<>(Collections.emptyList()));
        Node original = new Node(1, new ArrayList<>(
                List.of(
                        new Node(2, new ArrayList<>(List.of(n3)))
                )
        ));

        Node cloned = new _133_CloneGraph().cloneGraph(original);
        assertEquals(1, cloned.val);
        assertEquals(2, cloned.neighbors.get(0).val);
        assertEquals(3, cloned.neighbors.get(0).neighbors.get(0).val);
    }

    @Test
    public void cloneGraph2() {
        Node cloned = new _133_CloneGraph().cloneGraph(null);
        assertNull(cloned);
    }
}