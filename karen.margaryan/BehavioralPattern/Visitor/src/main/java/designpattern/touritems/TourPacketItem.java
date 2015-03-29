package designpattern.touritems;

import designpattern.visitor.Visitor;

/**
 * Created by Sony on 3/29/2015.
 */
public interface TourPacketItem {
    public void accept(Visitor visitor);
}
