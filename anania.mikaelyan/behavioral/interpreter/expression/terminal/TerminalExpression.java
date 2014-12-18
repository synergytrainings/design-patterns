package com.synisys.training.patterns.behavioral.interpreter.expression.terminal;

import com.sun.istack.internal.Nullable;
import com.sun.javafx.beans.annotations.NonNull;
import com.synisys.training.patterns.behavioral.interpreter.context.DataContext;
import com.synisys.training.patterns.behavioral.interpreter.context.Project;
import com.synisys.training.patterns.behavioral.interpreter.expression.AbstractExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Anania.Mikaelyan
 * @since 12/19/2014
 */
public abstract class TerminalExpression extends AbstractExpression{
    public TerminalExpression(@NonNull String searchString) {
        super(searchString);
    }

    @NonNull
    @Override
    public List<Project> interpret(@NonNull DataContext dataContext) {
        Objects.requireNonNull(dataContext);
        List<Project> projects = dataContext.getAllProjects();
        List<Project> result = new ArrayList<>(3);

        for(Project project: projects){
            if(match(project, getExpression())){
                result.add(project);
            }
        }
        return result;
    }

    protected abstract boolean match(@NonNull Project project, @NonNull  String searchString);
}
