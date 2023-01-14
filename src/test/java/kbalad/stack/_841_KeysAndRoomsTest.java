package kbalad.stack;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class _841_KeysAndRoomsTest {

    @Test
    public void canVisitAllRooms() {
        List<List<Integer>> input = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(3),
                Collections.emptyList()
        );
        boolean a = new _841_KeysAndRooms().canVisitAllRooms(input);
        assertTrue(a);
    }

    @Test
    public void canVisitAllRooms2() {
        List<List<Integer>> input = Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(3, 0, 1),
                Arrays.asList(2),
                Arrays.asList(0)
        );
        boolean a = new _841_KeysAndRooms().canVisitAllRooms(input);
        assertFalse(a);
    }
}