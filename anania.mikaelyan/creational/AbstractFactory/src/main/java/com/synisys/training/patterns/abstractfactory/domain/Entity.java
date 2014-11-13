package com.synisys.training.patterns.abstractfactory.domain;

/**
 * @author Anania.Mikaelyan
 * @since 10/31/2014
 */
public class Entity {
    private boolean isNew;
    private Long id;

    public Entity(boolean isNew, Long id) {
        this.isNew = isNew;
        this.id = id;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setOld() {
        this.isNew = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
