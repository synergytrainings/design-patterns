package com.synisys.training.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anania.Mikaelyan
 * @since 4/3/2015
 */
public class CalculatorCareTaker {
    private List<CalculatorMemento> mementoList = new ArrayList<CalculatorMemento>();

    public void add(CalculatorMemento state){
        mementoList.add(state);
    }

    public CalculatorMemento get(int index){
        return mementoList.get(index);
    }
}
