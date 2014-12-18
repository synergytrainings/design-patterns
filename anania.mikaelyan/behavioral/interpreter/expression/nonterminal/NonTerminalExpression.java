package com.synisys.training.patterns.behavioral.interpreter.expression.nonterminal;

import com.sun.javafx.beans.annotations.NonNull;
import com.synisys.training.patterns.behavioral.interpreter.context.DataContext;
import com.synisys.training.patterns.behavioral.interpreter.context.Project;
import com.synisys.training.patterns.behavioral.interpreter.expression.AbstractExpression;
import com.synisys.training.patterns.behavioral.interpreter.expression.terminal.ProjectExpression;
import com.synisys.training.patterns.behavioral.interpreter.expression.terminal.ProjectOrganisationExpression;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anania.Mikaelyan
 * @since 12/19/2014
 */
public class NonTerminalExpression extends AbstractExpression{

    public NonTerminalExpression(@NonNull String expression) {
        super(expression);
    }

    @Override
    public List<Project> interpret(@NonNull DataContext dataContext) {
        List<Project> result = new ArrayList<>(3);
        String[] expressionParts = getExpression().split(" or ");
        for(String expressionPart : expressionParts){
            if (expressionPart.contains("Title : ")){
                String[] subExpressionParts = expressionPart.split(" : ");
                if(subExpressionParts.length == 2 ){
                    result.addAll(new ProjectExpression(subExpressionParts[1]).interpret(dataContext));
                }
            }else if(expressionPart.contains("Organisation : ")){
                String[] subExpressionParts = expressionPart.split(" : ");
                if(subExpressionParts.length == 2 ){
                    result.addAll(new ProjectOrganisationExpression(subExpressionParts[1]).interpret(dataContext));
                }
            }
        }
        return result;
    }

}
