package com.synisys.training.patterns.adapter.api;

import java.util.List;
import java.util.Queue;

/**
 * Adapts {@link List} to {@link Queue}.
 *
 */
public interface ListAsQueueAdapter<E> extends Queue<E> {

}
