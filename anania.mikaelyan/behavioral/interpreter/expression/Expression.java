package com.synisys.training.patterns.behavioral.interpreter.expression;

import com.synisys.training.patterns.behavioral.interpreter.context.DataContext;
import com.synisys.training.patterns.behavioral.interpreter.context.Project;

import java.util.List;

/**
 * @author Anania.Mikaelyan
 * @since 12/18/2014
 */
public interface Expression {
    List<Project> interpret(DataContext dataContext);
}
