package com.synisys.design_patterns.interpreter;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by haykanush.torchyan on 1/13/2015.
 */
public class TerminalExpression extends Expression {

    private String literal = null;

    public TerminalExpression(String literal) {
        this.literal = literal;
    }

    public boolean interpret(String str) {
        String[] tokens = str.split(" ");
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals(literal)) {
                return true;
            }
        }
        return false;
    }
}
