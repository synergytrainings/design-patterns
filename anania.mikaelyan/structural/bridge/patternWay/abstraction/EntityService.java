package com.synisys.training.patterns.structural.bridge.patternWay.abstraction;

import com.synisys.training.patterns.structural.bridge.domain.Entity;

/**
 * Abstraction - defines the abstraction's interface. maintains a reference to an object of type Implementer.
 * @author Anania.Mikaelyan
 * @since 11/17/2014
 */
public abstract interface EntityService<E extends Entity> {
    E loadById(Long id);

    boolean save(E entity);
}
