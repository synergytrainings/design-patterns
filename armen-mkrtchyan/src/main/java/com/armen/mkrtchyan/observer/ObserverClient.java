package com.armen.mkrtchyan.observer;

import com.armen.mkrtchyan.observer.shop.Discount;
import com.armen.mkrtchyan.observer.shop.DiscountObserver;
import com.armen.mkrtchyan.observer.shop.ProductType;
import com.armen.mkrtchyan.observer.shop.Shop;
import com.google.common.collect.Sets;

import static com.google.common.collect.Sets.newHashSet;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Apr 07, 2015</pre>
 */
public class ObserverClient {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.subscribe(discount -> System.out.printf("first %s \n", discount.getPercent()),
                newHashSet(ProductType.SOMETHING_UNUSUAL, ProductType.CLOTH));
        shop.subscribe(discount -> System.out.printf("second %s \n", discount.getPercent()),
                newHashSet(ProductType.SHOE, ProductType.CLOTH));
        shop.subscribe(discount -> System.out.printf("third %s \n", discount.getPercent()),
                newHashSet(ProductType.SOMETHING_UNUSUAL, ProductType.SHOE));
//        first 10.0
//        second 10.0
        shop.addDiscount(new Discount(10, ProductType.CLOTH));
        System.out.println();
//        second 20.0
//        third 20.0
        shop.addDiscount(new Discount(20, ProductType.SHOE));
        System.out.println();
//        first 100.0
//        third 100.0
        shop.addDiscount(new Discount(100, ProductType.SOMETHING_UNUSUAL));

    }
}
