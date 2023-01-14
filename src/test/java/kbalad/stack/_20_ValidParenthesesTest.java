package kbalad.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class _20_ValidParenthesesTest {

    @Test
    public void isValid() {
        String s = "()";
        boolean e = true;
        boolean a = new _20_ValidParentheses().isValid(s);
        assertEquals(e, a);
    }

    @Test
    public void isValid2() {
        String s = "((()";
        boolean e = false;
        boolean a = new _20_ValidParentheses().isValid(s);
        assertEquals(e, a);
    }

    @Test
    public void isValid3() {
        String s = "{]";
        boolean e = false;
        boolean a = new _20_ValidParentheses().isValid(s);
        assertEquals(e, a);
    }
}