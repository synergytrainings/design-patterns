package com.synisys.training.patterns.behavioral.memento;

/**
 * Originator Implementation
 *
 * @author Anania.Mikaelyan
 * @since 4/3/2015
 */
public class Calculator {
    private int firstNumber;
    private int secondNumber;


    public int getCalculationResult() {
        // result is adding two numbers
        return firstNumber + secondNumber;
    }

    public CalculatorMemento backupLastCalculation() {
        // create a memento object used for restoring two numbers
        return new CalculatorMemento(firstNumber,secondNumber);
    }

    public void restorePreviousCalculation(CalculatorMemento memento) {
        this.firstNumber = memento.getFirstNumber();
        this.secondNumber = memento.getSecondNumber();
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber =  firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
}
