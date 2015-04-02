package com.synisys.training.patterns.behavioral.memento;

/**
 * Memento Object Implementation
 *
 * Note that this object implements both interfaces to Originator and CareTaker
 *
 * @author Anania.Mikaelyan
 * @since 4/3/2015
 */

public class CalculatorMemento {
    private int firstNumber;
    private int secondNumber;

    public CalculatorMemento(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }
}