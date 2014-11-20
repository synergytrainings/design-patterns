package com.synisys.training.patterns.structural.composite;

import javax.naming.OperationNotSupportedException;
import java.util.List;

/**
 * Leaf - represents leaf objects in the composition.  A leaf has no children.
 * @author Anania.Mikaelyan
 * @since 11/20/2014
 */
public class SimpleEntity implements Entity{
    private String name;

    public SimpleEntity(String name) {
        this.name = name;
    }

    @Override
    public void process() {
        System.out.println("Processing Simple Entity with name " + name);
    }



    @Override
    public List<Entity> getSubEntities() throws OperationNotSupportedException {
        throw new OperationNotSupportedException("No Child for Simple fields");
    }

    @Override
    public void addSubEntity(Entity entity) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Can't add child to Simple Entity");
    }

    @Override
    public void removeSubEntity(Entity entity) throws OperationNotSupportedException{
        throw new OperationNotSupportedException("Can't remove child to Simple Entity");
    }
}
