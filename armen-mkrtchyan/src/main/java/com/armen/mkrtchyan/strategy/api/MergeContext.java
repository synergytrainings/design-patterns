package com.armen.mkrtchyan.strategy.api;

import java.util.List;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Apr 14, 2015</pre>
 */
public class MergeContext {


    private MergeStrategy mergeStrategy;

    public MergeContext(MergeStrategy mergeStrategy) {
        this.mergeStrategy = mergeStrategy;
    }

    public void setMergeStrategy(MergeStrategy mergeStrategy) {
        this.mergeStrategy = mergeStrategy;
    }

    public List<String> merge(List<String> first, List<String> second) {
        return mergeStrategy.merge(first, second);
    }

}
