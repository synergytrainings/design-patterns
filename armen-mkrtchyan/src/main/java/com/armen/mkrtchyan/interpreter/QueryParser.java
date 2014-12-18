package com.armen.mkrtchyan.interpreter;

import com.google.common.collect.Sets;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Set;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 19, 2014</pre>
 */
public class QueryParser {

    private static final Set<String> STOP_WORDS = Sets.newHashSet("near", "find");

    public Queue<String> parse(String query) {
        String[] cut = query.split(" ");
        Queue<String> queue = new ArrayDeque<>();
        for (String word : cut) {
            if (!STOP_WORDS.contains(word.trim())) {
                queue.add(word.trim());
            }
        }
        return queue;
    }

}
