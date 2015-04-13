package com.armen.mkrtchyan.strategy.api;

import java.util.List;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Apr 14, 2015</pre>
 */
public interface MergeStrategy {

    List<String> merge(List<String> first, List<String> second);

}
