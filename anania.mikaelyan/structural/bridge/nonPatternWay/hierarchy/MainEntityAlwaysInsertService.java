package com.synisys.training.patterns.structural.bridge.nonPatternWay.hierarchy;

import com.synisys.training.patterns.structural.bridge.domain.MainEntity;

/**
 *
 * @author Anania.Mikaelyan
 * @since 11/17/2014
 */
public class MainEntityAlwaysInsertService extends MainEntityService {


    @Override
    public void incrementDeVersion() {

    }

    @Override
    public MainEntity loadById(Long id) {
        return null;
    }

    @Override
    public boolean save(MainEntity entity) {
        return false;
    }
}
