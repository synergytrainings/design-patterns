package com.armen.mkrtchyan.observer.shop;

import java.util.*;

/**
 * Observable
 * @author Armen.Mkrtchyan.
 * @version 1.0
 */
public class Shop {

    private final HashMap<DiscountObserver, Set<ProductType>> discountObservers = new HashMap<>();

    private final EnumMap<ProductType, Collection<Discount>> discounts;

    public Shop() {
        discounts = new EnumMap<>(ProductType.class);
        for (ProductType productType : ProductType.values()) {
            discounts.put(productType, new ArrayList<>());
        }
    }

    public void subscribe(DiscountObserver observer, Set<ProductType> aspects) {
        Set<ProductType> presentAspects;
        if ((presentAspects = discountObservers.get(observer)) == null) {
            discountObservers.put(observer, aspects);
        } else {
            presentAspects.addAll(aspects);
        }
    }

    public void addDiscount(Discount discount) {
        discounts.get(discount.getProductType()).add(discount);
        for (Map.Entry<DiscountObserver, Set<ProductType>> observerSetEntry : discountObservers.entrySet()) {
            if (observerSetEntry.getValue().contains(discount.getProductType())) {
                observerSetEntry.getKey().notify(discount);
            }
        }
    }

}
