package com.synisys.training.patterns.structural.bridge.nonPatternWay.hierarchy;

import com.synisys.training.patterns.structural.bridge.domain.Entity;
import com.synisys.training.patterns.structural.bridge.domain.SubEntity;

import java.util.List;

/**
 *
 * @author Anania.Mikaelyan
 * @since 11/17/2014
 */
public class SubEntityCrudService extends SubEntityService {

    @Override
    public List<SubEntity> loadAllByParent(Entity parent) {
        return null;
    }

    @Override
    public SubEntity loadById(Long id) {
        return null;
    }

    @Override
    public boolean save(SubEntity entity) {
        return false;
    }
}
