package kbalad.graph;

import java.util.*;

public class _399_EvaluateDivision {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Integer> charToNodeNumber = new HashMap<>();
        List<Route> abw = new ArrayList<>(); // source (A), destination (b), weight (w)

        int n = fillRoutes(equations, values, charToNodeNumber, abw);
        UnionFind uf = new UnionFind(n);
        for (Route route : abw) {
            uf.union(route);
        }

        double[] res = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            String aStr = query.get(0);
            String bStr = query.get(1);

            Integer a = charToNodeNumber.get(aStr);
            Integer b = charToNodeNumber.get(bStr);
            if (a == null || b == null) {
                res[i] = -1.0;
                continue;
            }

            RootAndWeight ra = uf.find(a);
            RootAndWeight rb = uf.find(b);
            if (!ra.inOneTree(rb)) {
                res[i] = -1.0;
                continue;
            }

            res[i] = ra.weight / rb.weight;
        }
        return res;
    }

    private static int fillRoutes(
            List<List<String>> equations,
            double[] values,
            Map<String, Integer> charToNodeNumber,
            List<Route> abw
    ) {
        int nodeCtr = 0;
        for (int i = 0; i < equations.size(); i++) {
            List<String> pair = equations.get(i);
            String aStr = pair.get(0);
            String bStr = pair.get(1);
            int a, b;
            if (charToNodeNumber.get(aStr) == null) {
                a = nodeCtr;
                charToNodeNumber.put(aStr, nodeCtr++);
            } else {
                a = charToNodeNumber.get(aStr);
            }
            if (charToNodeNumber.get(bStr) == null) {
                b = nodeCtr;
                charToNodeNumber.put(bStr, nodeCtr++);
            } else {
                b = charToNodeNumber.get(bStr);
            }

            abw.add(new Route(a, b, values[i]));
        }
        return nodeCtr;
    }

    private final static class Route {
        int a;
        int b;
        double w;

        public Route(int a, int b, double w) {
            this.a = a;
            this.b = b;
            this.w = w;
        }
    }

    private final static class RootAndWeight {
        int root;
        double weight;

        public RootAndWeight(int root, double weight) {
            this.root = root;
            this.weight = weight;
        }

        public boolean inOneTree(RootAndWeight other) {
            return this.root == other.root;
        }

        public RootAndWeight multiply(double factor) {
            this.weight *= factor;
            return this;
        }
    }

    private final static class UnionFind {
        private final int[] root;
        private final double[] weightToRoot;

        public UnionFind(int n) {
            root = new int[n];
            weightToRoot = new double[n];
            for (int i = 0; i < n; i++) {
                root[i] = i;
                weightToRoot[i] = 1.0;
            }
        }

        public void union(Route route) {
            int a = route.a;
            int b = route.b;
            double w = route.w;

            RootAndWeight rwa = find(a);
            int rootA = rwa.root;
            RootAndWeight rwb = find(b);
            int rootB = rwb.root;
            if (rootA != rootB) {
                root[rootA] = rootB;
                weightToRoot[rootA] = rwb.weight * w / rwa.weight;
            }
        }

        public RootAndWeight find(int i) {
            if (i == root[i]) {
                return new RootAndWeight(i, weightToRoot[i]);
            }

            RootAndWeight ret = find(root[i]).multiply(weightToRoot[i]);
            root[i] = ret.root;
            weightToRoot[i] = ret.weight;
            return ret;
        }
    }
}
