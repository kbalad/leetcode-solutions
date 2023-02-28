package kbalad.graph;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _332_ReconstructItineraryTest {

    @Test
    void findItinerary() {
        List<List<String>> tickets = List.of(
                List.of("MUC", "LHR"),
                List.of("JFK", "MUC"),
                List.of("SFO", "SJC"),
                List.of("LHR", "SFO")
        );

        List<String> act = new _332_ReconstructItinerary().findItinerary(tickets);
        List<String> exp = List.of("JFK","MUC","LHR","SFO","SJC");

        assertEquals(exp, act);
    }

    @Test
    void findItinerary2() {
        List<List<String>> tickets = List.of(
                List.of("JFK", "SFO"),
                List.of("JFK", "ATL"),
                List.of("SFO", "ATL"),
                List.of("ATL", "JFK"),
                List.of("ATL", "SFO")
        );

        List<String> act = new _332_ReconstructItinerary().findItinerary(tickets);
        List<String> exp = List.of("JFK","ATL","JFK","SFO","ATL","SFO");

        assertEquals(exp, act);
    }
}