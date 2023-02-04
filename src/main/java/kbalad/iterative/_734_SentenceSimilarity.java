package kbalad.iterative;

import java.util.*;

public class _734_SentenceSimilarity {
    public boolean areSentencesSimilar(String[] s1, String[] s2, List<List<String>> similarPairs) {
        if (s1.length != s2.length) {
            return false;
        }
        Map<String, Set<String>> sims = new HashMap<>();
        similarPairs.forEach(pair -> {
            String a = pair.get(0);
            String b = pair.get(1);
            if (!a.equals(b)) {
                sims.putIfAbsent(a, new HashSet<>());
                sims.putIfAbsent(b, new HashSet<>());
                sims.get(a).add(b);
                sims.get(b).add(a);
            }
        });

        for (int i = 0; i < s1.length; i++) {
            String a = s1[i];
            String b = s2[i];
            if (a.equals(b)) continue;
            if (sims.get(a) == null) return false;
            if (sims.get(a).contains(b)) continue;
            return false;
        }
        return true;
    }
}
