package com.synisys.training.patterns.structural.bridge.nonPatternWay.hierarchy;

import com.synisys.training.patterns.structural.bridge.patternWay.abstraction.EntityService;
import com.synisys.training.patterns.structural.bridge.domain.Entity;
import com.synisys.training.patterns.structural.bridge.domain.SubEntity;

import java.util.List;

/**
 *
 * @author Anania.Mikaelyan
 * @since 11/17/2014
 */
public abstract class SubEntityService implements EntityService<SubEntity> {
    public abstract List<SubEntity> loadAllByParent(Entity parent);
}
