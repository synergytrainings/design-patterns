package com.synisys.design_patterns.command.invoker;

import com.synisys.design_patterns.command.command.Service;
import com.synisys.design_patterns.command.invoker.entity.Profile;

/**
 * Created by haykanush.torchyan on 12/14/2014.
 */
public class ProfileForm extends Form {

    private Profile profile;

    public ProfileForm(Profile profile, Service service){
        this.service = service;
    }

    @Override
    public void save() {
        this.service.save(profile);
    }
}
