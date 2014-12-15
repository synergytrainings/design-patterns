package com.synisys.design_patterns.command.command;

import com.synisys.design_patterns.command.invoker.entity.Entity;
import com.synisys.design_patterns.command.receiver.Dao;

/**
 * Created by haykanush.torchyan on 12/14/2014.
 */
public abstract class Service {

    protected Dao dao;

    public abstract void save(Entity entity);
}
