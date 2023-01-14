package kbalad.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class _150_EvaluateReversePolishNotationTest {

    @Test
    public void evalRPN() {
        String[] in = {"2","1","+","3","*"};
        int a = new _150_EvaluateReversePolishNotation().evalRPN(in);
        assertEquals(9, a);
    }

    @Test
    public void evalRPN1() {
        String[] in = { "4","13","5","/","+"};
        int a = new _150_EvaluateReversePolishNotation().evalRPN(in);
        assertEquals(6, a);
    }

    @Test
    public void evalRPN2() {
        String[] in = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int a = new _150_EvaluateReversePolishNotation().evalRPN(in);
        assertEquals(22, a);
    }
}