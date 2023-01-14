package kbalad.bfs;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class _752_OpenTheLockTest {

    @Test
    public void openLock() {
        String[] deadends = {"0201","0101","0102","1212","2002"};
        String target = "0202";
        int a = new _752_OpenTheLock().openLock(deadends, target);
        int e = 6;
        assertEquals(e, a);
    }

    @Test
    public void openLock0() {
        String[] deadends = {"8888"};
        String target = "0009";
        int a = new _752_OpenTheLock().openLock(deadends, target);
        int e = 1;
        assertEquals(e, a);
    }

    @Test
    public void openLock1() {
        String[] deadends = {"8887","8889","8878","8898","8788","8988","7888","9888"};
        String target = "8888";
        int a = new _752_OpenTheLock().openLock(deadends, target);
        int e = -1;
        assertEquals(e, a);
    }

    @Test
    public void openLock2() {
        String[] deadends = {"0000"};
        String target = "8888";
        int a = new _752_OpenTheLock().openLock(deadends, target);
        int e = -1;
        assertEquals(e, a);
    }
}