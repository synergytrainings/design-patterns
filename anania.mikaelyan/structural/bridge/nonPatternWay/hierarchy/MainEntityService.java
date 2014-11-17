package com.synisys.training.patterns.structural.bridge.nonPatternWay.hierarchy;

import com.synisys.training.patterns.structural.bridge.patternWay.abstraction.EntityService;
import com.synisys.training.patterns.structural.bridge.domain.MainEntity;

/**
 *
 * @author Anania.Mikaelyan
 * @since 11/17/2014
 */
public abstract class MainEntityService implements EntityService<MainEntity> {

    public abstract void incrementDeVersion();
}
