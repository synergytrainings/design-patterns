package com.synisys.training.patterns.structural.facade.facade;

import com.synisys.training.patterns.structural.composite.Entity;

/**
 * Facade ? The class for clients to use.
 * It knows about the subsystems it uses and their respective responsibilities.
 * Normally all client requests will be delegated to the appropriate subsystems.
 *
 * @author Anania.Mikaelyan
 * @since 11/27/2014
 */
public interface MailNotificationService {
    boolean sendMailNotificationOnEntitySave(Entity entity);
}
