package com.synisys.training.patterns.structural.bridge.patternWay.abstraction;

import com.synisys.training.patterns.structural.bridge.domain.MainEntity;
import com.synisys.training.patterns.structural.bridge.patternWay.implementation.ServiceImplementer;

/**
 * RefinedAbstraction ? Extends the interface defined by Abstraction
 *
 * @author Anania.Mikaelyan
 * @since 11/17/2014
 */
public class MainEntityService implements EntityService<MainEntity> {
    private final ServiceImplementer serviceImplementer;

    public MainEntityService(ServiceImplementer serviceImplementer) {
        this.serviceImplementer = serviceImplementer;
    }


    @Override
    public MainEntity loadById(Long id) {
        return serviceImplementer.loadMainEntityById(id);
    }

    @Override
    public boolean save(MainEntity entity) {
        return serviceImplementer.saveMainEntity(entity);
    }

    public void incrementDeVersion(){
        serviceImplementer.incrementDeVersion();
    }
}
