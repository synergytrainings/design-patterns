package com.synisys.training.patterns.behavioral.state;

/**
 * Context
 * defines the interface of interest to clients.
 * maintains an instance of a ConcreteState subclass that defines the current state.
 * @author Anania.Mikaelyan
 * @since 4/9/2015
 */
public class DeForm {
    private Object data;
    private DeState currentState;


    public void save() {
        currentState.save(this);
    }

    public void saveClose() {
        currentState.saveClose(this);
    }

    public void edit() {
        currentState.edit(this);
    }

    public void cancel() {
        currentState.cancel(this);
    }

    public void setCurrentState(DeState currentState) {
        this.currentState = currentState;
    }

    public DeState getCurrentState() {
        return currentState;
    }
}
