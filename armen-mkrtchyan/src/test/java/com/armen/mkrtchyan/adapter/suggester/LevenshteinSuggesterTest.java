package com.armen.mkrtchyan.adapter.suggester;

import com.armen.mkrtchyan.adapter.LevenshteinSuggester;
import com.google.common.collect.Sets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LevenshteinSuggesterTest {

    private LevenshteinSuggester suggester;

    @Before
    public void setUp() throws Exception {
        suggester = new LevenshteinSuggester(Sets.newHashSet("Upper Armenia", "Sophene", "Aghdznik", "Turuberan", "Corduene",
                "Moxoene", "Nor Shirakan", "Vaspurakan", "Syunik", "Artsakh", "Paytkaran", "Utik", "Gugark", "Tayk", "Ayrarat"));
    }

    @Test
    public void testSuggest() throws Exception {
        assertSame("Ayrarat", suggester.suggest("Artarart"));
    }
}