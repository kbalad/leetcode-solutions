package kbalad.graph;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _399_EvaluateDivisionTest {

    @Test
    void calcEquation() {
        List<List<String>> equations = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("b", "c")
        );
        double[] values = new double[]{2.0, 3.0};
        List<List<String>> queries = Arrays.asList(
                Arrays.asList("a", "c"),
                Arrays.asList("b", "a"),
                Arrays.asList("a", "e"),
                Arrays.asList("a", "a"),
                Arrays.asList("x", "x")
        );

        double[] act = new _399_EvaluateDivision().calcEquation(equations, values, queries);
        double[] exp = new double[]{6.0, 0.5, -1.0, 1.0, -1.0};
        double delta = 0.00000001;

        assertArrayEquals(exp, act, delta);
    }

    @Test
    void calcEquation_2() {
        List<List<String>> equations = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("b", "c"),
                Arrays.asList("bc", "cd")
        );
        double[] values = new double[]{1.5, 2.5, 5.0};
        List<List<String>> queries = Arrays.asList(
                Arrays.asList("a", "c"),
                Arrays.asList("c", "b"),
                Arrays.asList("bc", "cd"),
                Arrays.asList("cd", "bc")
        );

        double[] act = new _399_EvaluateDivision().calcEquation(equations, values, queries);
        double[] exp = new double[]{3.75, 0.4, 5.0, 0.2};
        double delta = 0.00000001;

        assertArrayEquals(exp, act, delta);
    }

    @Test
    void calcEquation_3() {
        List<List<String>> equations = List.of(
                Arrays.asList("a", "b")
        );
        double[] values = new double[]{0.5};
        List<List<String>> queries = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("b", "a"),
                Arrays.asList("a", "c"),
                Arrays.asList("x", "y")
        );

        double[] act = new _399_EvaluateDivision().calcEquation(equations, values, queries);
        double[] exp = new double[]{0.5, 2.0, -1.0, -1.0};
        double delta = 0.00000001;

        assertArrayEquals(exp, act, delta);
    }

    @Test
    void calcEquation_4() {
        List<List<String>> equations = Arrays.asList(
                Arrays.asList("x1", "x2"),
                Arrays.asList("x2", "x3"),
                Arrays.asList("x3", "x4"),
                Arrays.asList("x4", "x5")
        );
        double[] values = new double[]{3.0, 4.0, 5.0, 6.0};
        List<List<String>> queries = Arrays.asList(
                Arrays.asList("x1", "x5"),
                Arrays.asList("x5", "x2"),
                Arrays.asList("x2", "x4"),
                Arrays.asList("x2", "x2"),
                Arrays.asList("x2", "x9"),
                Arrays.asList("x9", "x9")
        );

        double[] act = new _399_EvaluateDivision().calcEquation(equations, values, queries);
        double[] exp = new double[]{360.00000, 0.00833, 20.00000, 1.00000, -1.00000, -1.00000};
        double delta = 0.00001;

        assertArrayEquals(exp, act, delta);
    }

    @Test
    void calcEquation_5() {
        List<List<String>> equations = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "b"),
                Arrays.asList("d", "b"),
                Arrays.asList("w", "x"),
                Arrays.asList("y", "x"),
                Arrays.asList("z", "x"),
                Arrays.asList("w", "d")
        );
        double[] values = new double[]{2, 3, 4, 5, 6, 7, 8};
        List<List<String>> queries = Arrays.asList(
                Arrays.asList("a", "c"),
                Arrays.asList("b", "c"),
                Arrays.asList("a", "e"),
                Arrays.asList("a", "a"),
                Arrays.asList("x", "x"),
                Arrays.asList("a", "z")
        );

        double[] act = new _399_EvaluateDivision().calcEquation(equations, values, queries);
        double[] exp = new double[]{0.66666, 0.33333, -1, 1.00000, 1.00000, 0.04464};
        double delta = 0.00001;

        assertArrayEquals(exp, act, delta);
    }
}