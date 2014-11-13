package com.armen.mkrtchyan.adapter;

import org.apache.commons.lang3.StringUtils;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author armen mkrtchyan
 * @version 1.0
 */
public class LevenshteinSuggester implements Suggester {

    private final Set<String> dictionary;

    public LevenshteinSuggester(Set<String> dictionary) {
        this.dictionary = dictionary;
    }

    private int calculate(String from, String to) {
        return StringUtils.getLevenshteinDistance(from, to);
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
            heap.add(items);
        }
        return heap.peek();
    }

}
