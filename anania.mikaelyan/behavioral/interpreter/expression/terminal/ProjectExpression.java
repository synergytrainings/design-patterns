package com.synisys.training.patterns.behavioral.interpreter.expression.terminal;


import com.sun.javafx.beans.annotations.NonNull;
import com.synisys.training.patterns.behavioral.interpreter.context.Project;

import java.util.Objects;

/**
 * @author Anania.Mikaelyan
 * @since 12/18/2014
 */
public class ProjectExpression extends TerminalExpression {

    public ProjectExpression(@NonNull String searchString) {
        super(Objects.requireNonNull(searchString));
    }

    @Override
    protected boolean match(@NonNull Project project, @NonNull String searchString) {
        Objects.requireNonNull(project);
        Objects.requireNonNull(searchString);
        return project.getTitle().equalsIgnoreCase(searchString);
    }
}
