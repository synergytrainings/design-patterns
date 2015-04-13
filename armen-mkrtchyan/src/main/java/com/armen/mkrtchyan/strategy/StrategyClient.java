package com.armen.mkrtchyan.strategy;

import com.armen.mkrtchyan.strategy.api.MergeContext;
import com.armen.mkrtchyan.strategy.impl.FastForward;
import com.armen.mkrtchyan.strategy.impl.Intersect;

import java.util.Arrays;
import java.util.List;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Apr 14, 2015</pre>
 */
public class StrategyClient {

    public static void main(String[] args) {
        MergeContext mergeContext = new MergeContext(new FastForward());
        List<String> resultFF = mergeContext.merge(Arrays.asList("1", "2", "3"), Arrays.asList("4", "5"));
        mergeContext.setMergeStrategy(new Intersect());
        List<String> resultIntersect = mergeContext.merge(Arrays.asList("1", "2", "3"), Arrays.asList("3", "4", "5"));
        //[1, 2, 3, 4, 5]
        System.out.println(resultFF);
        //[1, 2, 3, 4, 5]
        System.out.println(resultIntersect);
        mergeContext.setMergeStrategy(new FastForward());
        //java.lang.IllegalStateException: Cannot fast forward
        resultFF = mergeContext.merge(Arrays.asList("1", "2", "3"), Arrays.asList("3", "4", "5"));
    }


}
