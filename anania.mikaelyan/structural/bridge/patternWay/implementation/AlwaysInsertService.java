package com.synisys.training.patterns.structural.bridge.patternWay.implementation;

import com.synisys.training.patterns.structural.bridge.domain.Entity;
import com.synisys.training.patterns.structural.bridge.domain.MainEntity;
import com.synisys.training.patterns.structural.bridge.domain.SubEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteImplementor - implements the Implementor interface and defines its concrete implementation.
 *
 * @author Anania.Mikaelyan
 * @since 11/17/2014
 */
public class AlwaysInsertService implements ServiceImplementer {
    @Override
    public MainEntity loadMainEntityById(Long id) {
        return new MainEntity(1l);
    }

    @Override
    public SubEntity loadSubEntityById(Long id) {
        return null;
    }

    @Override
    public boolean saveMainEntity(MainEntity mainEntity) {
        return false;
    }

    @Override
    public boolean saveSubEntity(SubEntity subEntity) {
        return false;
    }

    @Override
    public List<SubEntity> loadAllSubEntitiesByParent(Entity parent) {
        return new ArrayList<>();
    }

    @Override
    public void incrementDeVersion() {

    }
}
