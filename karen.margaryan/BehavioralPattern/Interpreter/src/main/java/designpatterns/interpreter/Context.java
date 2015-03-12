package designpatterns.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Karen on 3/12/2015.
 */
public class Context {
    private String expression;
    private Map<String, String> mappings = new HashMap<>();

    public Context() {
    }

    public void setExpression(String expression) {
        this.expression = expression.toUpperCase();
    }

    public String getExpression() {
        return expression;
    }

    public void addMapping(String key, String value) {
        mappings.put(key.toUpperCase(), value.toUpperCase());
    }

    public void setMappings(Map<String, String> mappings) {
        this.mappings = mappings;
    }

    public Map<String, String> getMappings() {
        return mappings;
    }
}
