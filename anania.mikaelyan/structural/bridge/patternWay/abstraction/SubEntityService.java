package com.synisys.training.patterns.structural.bridge.patternWay.abstraction;

import com.synisys.training.patterns.structural.bridge.domain.Entity;
import com.synisys.training.patterns.structural.bridge.domain.SubEntity;
import com.synisys.training.patterns.structural.bridge.patternWay.implementation.ServiceImplementer;

import java.util.List;

/**
 * RefinedAbstraction ? Extends the interface defined by Abstraction
 *
 * @author Anania.Mikaelyan
 * @since 11/17/2014
 */
public class SubEntityService implements EntityService<SubEntity> {
    private final ServiceImplementer serviceImplementer;

    public SubEntityService(ServiceImplementer serviceImplementer) {
        this.serviceImplementer = serviceImplementer;
    }

    @Override
    public SubEntity loadById(Long id) {
        return serviceImplementer.loadSubEntityById(id);
    }

    @Override
    public boolean save(SubEntity entity) {
        return serviceImplementer.saveSubEntity(entity);
    }

    public List<SubEntity> loadAllByParent(Entity parent) {
        return serviceImplementer.loadAllSubEntitiesByParent(parent);
    }
}
