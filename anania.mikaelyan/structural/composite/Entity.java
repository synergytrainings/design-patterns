package com.synisys.training.patterns.structural.composite;

import javax.naming.OperationNotSupportedException;
import java.util.List;

/**
 * Component
 *
 *  declares the interface  for objects in the composition.
 *  implements default behavior for the interface common to all classes, as appropriate.
 *  declares an interface for accessing and managing its child  components.
 *
 * @author Anania.Mikaelyan
 * @since 11/20/2014
 */
public interface Entity {
    //default behavior
    void process();

    //accessing and managing its child  components
    List<Entity> getSubEntities() throws OperationNotSupportedException;
    void addSubEntity(Entity entity) throws OperationNotSupportedException;
    void removeSubEntity(Entity entity) throws OperationNotSupportedException;
}
