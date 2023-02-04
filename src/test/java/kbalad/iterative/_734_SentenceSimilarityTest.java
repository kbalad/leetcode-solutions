package kbalad.iterative;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _734_SentenceSimilarityTest {

    @Test
    void areSentencesSimilar() {
        String[] s1 = new String[]{"great","acting","skills"};
        String[] s2 = new String[]{"fine","drama","talent"};
        List<List<String>> similarPairs = Arrays.asList(
                Arrays.asList("great","fine"),
                Arrays.asList("drama","acting"),
                Arrays.asList("skills","talent")
        );

        boolean a = new _734_SentenceSimilarity().areSentencesSimilar(s1, s2, similarPairs);
        boolean e = true;

        assertEquals(e, a);
    }

    @Test
    void areSentencesSimilar_2() {
        String[] s1 = new String[]{"great"};
        String[] s2 = new String[]{"great"};
        List<List<String>> similarPairs = Collections.emptyList();

        boolean a = new _734_SentenceSimilarity().areSentencesSimilar(s1, s2, similarPairs);
        boolean e = true;

        assertEquals(e, a);
    }

    @Test
    void areSentencesSimilar_3() {
        String[] s1 = new String[]{"great"};
        String[] s2 = new String[]{"doubleplus", "good"};
        List<List<String>> similarPairs = List.of(
                List.of("great", "doubleplus")
        );

        boolean a = new _734_SentenceSimilarity().areSentencesSimilar(s1, s2, similarPairs);
        boolean e = false;

        assertEquals(e, a);
    }
}