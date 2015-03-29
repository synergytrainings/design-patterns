package designpattern.touritems;

import designpattern.visitor.Visitor;

import java.util.Arrays;

/**
 * Created by Sony on 3/29/2015.
 */
public class CustomPackage implements TourPacketItem {

    private TourPacketItem[] tourOptions;

    public CustomPackage(TourPacketItem[] packetItems) {
        tourOptions = Arrays.copyOfRange(packetItems, 0, packetItems.length);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (TourPacketItem item : tourOptions) {
            item.accept(visitor);
        }
    }

    public TourPacketItem[] getTourOptions() {
        return tourOptions;
    }
}
