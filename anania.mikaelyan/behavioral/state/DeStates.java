package com.synisys.training.patterns.behavioral.state;

/**
 * ConcreteState subclasses
 * each subclass implements a behavior associated with a state of the Context.
 * @author Anania.Mikaelyan
 * @since 4/9/2015
 */
public enum DeStates implements DeState{
    NEW {
        @Override
        public void save(DeForm deForm) {
            System.out.println("Saves de Form data in new state and go to edit mode");
            deForm.setCurrentState(EDIT);
        }

        @Override
        public void saveClose(DeForm deForm) {
            System.out.println("Saves de Form data and close edit mode");
            deForm.setCurrentState(VIEW);
        }

        @Override
        public void edit(DeForm deForm) {
            throw new IllegalStateException("Edit is not acceptable invocation from New state");
        }

        @Override
        public void cancel(DeForm deForm) {
            System.out.println("Cancel new data entry");
            deForm.setCurrentState(null);
        }
    },
    EDIT {
        @Override
        public void save(DeForm deForm) {
            System.out.println("Saves de Form data and stays on edit mode");
            deForm.setCurrentState(EDIT);
        }

        @Override
        public void saveClose(DeForm deForm) {
            System.out.println("Saves de Form data and close edit mode");
            deForm.setCurrentState(VIEW);
        }

        @Override
        public void edit(DeForm deForm) {
            throw new IllegalStateException("Edit is not acceptable invocation from Edit state");
        }

        @Override
        public void cancel(DeForm deForm) {
            System.out.println("Cancel data entry");
            deForm.setCurrentState(null);
        }
    },
    VIEW {
        @Override
        public void save(DeForm deForm) {
            throw new IllegalStateException("Save is not acceptable invocation from View state");
        }

        @Override
        public void saveClose(DeForm deForm) {
            throw new IllegalStateException("Save is not acceptable invocation from View state");
        }

        @Override
        public void edit(DeForm deForm) {
            System.out.println("Open Edit mode");
            deForm.setCurrentState(EDIT);
        }

        @Override
        public void cancel(DeForm deForm) {
            System.out.println("Closes de");
            deForm.setCurrentState(null);
        }
    }
}
