package com.synisys.training.patterns.structural.composite;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Anania.Mikaelyan
 * @since 11/20/2014
 */
public class ComplexEntity implements Entity {
    private List<Entity> subEntities = new ArrayList<>();
    @Override
    public void process() {
        System.out.println("Processing Complex Entity.");
        for (Entity subEntity : subEntities) {
            subEntity.process();
        }
    }



    @Override
    public List<Entity> getSubEntities() throws OperationNotSupportedException {
        return subEntities;
    }

    @Override
    public void addSubEntity(Entity entity) throws OperationNotSupportedException {
        subEntities.add(entity);
    }

    @Override
    public void removeSubEntity(Entity entity) throws OperationNotSupportedException {
        subEntities.remove(entity);
    }
}
