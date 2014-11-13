package com.armen.mkrtchyan.adapter;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author armen mkrtchyan
 * @version 1.0
 */
public class HammingSuggester implements Suggester {

    private final Set<String> dictionary;

    public HammingSuggester(Set<String> dictionary) {
        this.dictionary = dictionary;
    }

    private int calculate(String from, String to) {
        if (from.length() != to.length()) {
            throw new IllegalArgumentException("hamming distance cannot be calculated for strings with different size");
        }
        int distance = 0;
        for (int i = 0; i < from.length(); i++) {
            if (from.charAt(i) != to.charAt(i)) {
                distance++;
            }
        }
        return distance;
    }

    @Override
    public String suggest(final String from) {
        PriorityQueue<String> heap = new PriorityQueue<>(dictionary.size(), new Comparator<String>() {
            @Override
            public int compare(String first, String second) {
                return calculate(from, first) - calculate(from, second);
            }
        });
        for (String items : dictionary) {
            if (items.length() == from.length()) {
                heap.add(items);
            }
        }
        return heap.peek();
    }
}
