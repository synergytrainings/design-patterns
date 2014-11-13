package com.armen.mkrtchyan.adapter.suggester;

import com.armen.mkrtchyan.adapter.HammingSuggester;
import com.google.common.collect.Sets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HammingSuggesterTest {

    private HammingSuggester suggester;

    @Before
    public void before() throws Exception {
        suggester = new HammingSuggester(Sets.newHashSet("Upper Armenia", "Sophene", "Aghdznik", "Turuberan", "Corduene",
                "Moxoene", "Nor Shirakan", "Vaspurakan", "Syunik", "Artsakh", "Paytkaran", "Utik", "Gugark", "Tayk", "Ayrarat"));
    }

    @Test
    public void testSuggest() throws Exception {
         assertSame("Gugark", suggester.suggest("Kugarq"));
    }
}