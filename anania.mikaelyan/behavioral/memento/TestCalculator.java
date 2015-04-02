package com.synisys.training.patterns.behavioral.memento;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Anania.Mikaelyan
 * @since 4/3/2015
 */

public class TestCalculator {
        @Test
        public void test() {

            // program starts
            Calculator calculator = new Calculator();
            CalculatorCareTaker careTaker = new CalculatorCareTaker();


            // assume user enters two numbers
            calculator.setFirstNumber(10);
            calculator.setSecondNumber(100);

            // find result
            Assert.assertEquals(110, calculator.getCalculationResult());

            // Store result of this calculation in case of error
            careTaker.add(calculator.backupLastCalculation());

            // user enters a number
            calculator.setFirstNumber(17);

            // user enters a wrong second number and calculates result
            calculator.setSecondNumber(-290);

            // calculate result
            Assert.assertEquals(-273, calculator.getCalculationResult());

            // user hits CTRL + Z to undo last operation and see last result
            calculator.restorePreviousCalculation(careTaker.get(0));

            // result restored
            Assert.assertEquals(110, calculator.getCalculationResult());
        }
}
