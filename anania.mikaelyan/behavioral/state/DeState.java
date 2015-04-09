package com.synisys.training.patterns.behavioral.state;

/**
 * State
 * defines an interface for encapsulating the behavior associated with a particular state of the Context.
 * @author Anania.Mikaelyan
 * @since 4/9/2015
 */
public interface DeState {
    void save(DeForm deForm);
    void saveClose(DeForm deForm);
    void edit(DeForm deForm);
    void cancel(DeForm deForm);
}
