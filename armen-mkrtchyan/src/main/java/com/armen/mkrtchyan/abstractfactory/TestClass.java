package com.armen.mkrtchyan.abstractfactory;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author armen mkrtchyan.
 * @version 1.0
 * @since <pre>Oct 31, 2014</pre>
 */
public class TestClass implements Serializable{

    private int dummyInt;

    private String dummyString;

    private BigDecimal dummyBigDecimal;

    private List<Integer> dummyIntegerList;

    public TestClass(int dummyInt, String dummyString, BigDecimal dummyBigDecimal, List<Integer> dummyIntegerList) {
        this.dummyInt = dummyInt;
        this.dummyString = dummyString;
        this.dummyBigDecimal = dummyBigDecimal;
        this.dummyIntegerList = dummyIntegerList;
    }

    public int getDummyInt() {
        return dummyInt;
    }

    public String getDummyString() {
        return dummyString;
    }

    public BigDecimal getDummyBigDecimal() {
        return dummyBigDecimal;
    }

    public List<Integer> getDummyIntegerList() {
        return dummyIntegerList;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestClass testClass = (TestClass) o;

        if (dummyInt != testClass.dummyInt) return false;
        if (dummyBigDecimal != null ? !dummyBigDecimal.equals(testClass.dummyBigDecimal) : testClass.dummyBigDecimal != null)
            return false;
        if (dummyIntegerList != null ? !dummyIntegerList.equals(testClass.dummyIntegerList) : testClass.dummyIntegerList != null)
            return false;
        if (dummyString != null ? !dummyString.equals(testClass.dummyString) : testClass.dummyString != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dummyInt;
        result = 31 * result + (dummyString != null ? dummyString.hashCode() : 0);
        result = 31 * result + (dummyBigDecimal != null ? dummyBigDecimal.hashCode() : 0);
        result = 31 * result + (dummyIntegerList != null ? dummyIntegerList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "dummyInt=" + dummyInt +
                ", dummyString='" + dummyString + '\'' +
                ", dummyBigDecimal=" + dummyBigDecimal +
                ", dummyIntegerList=" + dummyIntegerList +
                '}';
    }
}
