package designpatterns.interpreter;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.StringTokenizer;

/**
 * Created by Karen on 3/12/2015.
 */
public class Main {
    public static void main(String[] args) throws ScriptException {
        Context context = new Context();
        context.setExpression("11 gbp to USD");
        context.addMapping("usd", "480");
        context.addMapping("gbp", "720");
        context.addMapping("eur", "505");


        Evaluator evaluator = new Evaluator();
        String translatedExpression = evaluator.interpret(context);
        System.out.println(translatedExpression);


        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine engine = scriptEngineManager.getEngineByName("JavaScript");
        System.out.println(engine.eval(translatedExpression));
    }

}