package com.synisys.training.patterns.structural.bridge.domain;

/**
 * @author Anania.Mikaelyan
 * @since 11/17/2014
 */
public class Entity {
    private Long id;

    public Entity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
