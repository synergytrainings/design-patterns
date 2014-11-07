package com.armen.mkrtchyan.prototype;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Nov 07, 2014</pre>
 */
public class PrototypeTester {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(PrototypeManager.getElement("body").getHtml());
        PrototypeManager.edit("div").getChildElements().clear();
        System.out.println("--------------------");
        System.out.println(PrototypeManager.getElement("body").getHtml());
    }

}
