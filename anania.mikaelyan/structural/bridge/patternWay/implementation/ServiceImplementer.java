package com.synisys.training.patterns.structural.bridge.patternWay.implementation;

import com.synisys.training.patterns.structural.bridge.domain.Entity;
import com.synisys.training.patterns.structural.bridge.domain.MainEntity;
import com.synisys.training.patterns.structural.bridge.domain.SubEntity;

import java.util.List;

/**
 * Implementor - defines the interface for implementation classes
 *
 * @author Anania.Mikaelyan
 * @since 11/17/2014
 */
public interface ServiceImplementer {
    MainEntity loadMainEntityById(Long id);
    SubEntity loadSubEntityById(Long id);

    boolean saveMainEntity(MainEntity mainEntity);
    boolean saveSubEntity(SubEntity subEntity);

    List<SubEntity> loadAllSubEntitiesByParent(Entity parent);
    void incrementDeVersion();
}
