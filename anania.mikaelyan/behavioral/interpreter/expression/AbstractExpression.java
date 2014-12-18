package com.synisys.training.patterns.behavioral.interpreter.expression;

import com.sun.javafx.beans.annotations.NonNull;

import java.util.Objects;

/**
 * @author Anania.Mikaelyan
 * @since 12/19/2014
 */
public abstract class AbstractExpression implements Expression {
    private final String expression;

    public AbstractExpression(@NonNull String searchString) {
        this.expression = Objects.requireNonNull(searchString);
    }

    public String getExpression() {
        return expression;
    }
}
