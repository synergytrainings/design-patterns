package com.synisys.design_patterns.command.invoker;

import com.synisys.design_patterns.command.command.Service;

/**
 * Created by haykanush.torchyan on 12/14/2014.
 */
public abstract class Form {

    protected Service service;

    public abstract void save();
}
