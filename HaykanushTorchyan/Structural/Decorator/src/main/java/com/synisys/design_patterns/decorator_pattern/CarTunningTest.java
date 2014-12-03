package com.synisys.design_patterns.decorator_pattern;

import com.synisys.design_patterns.decorator_pattern.component.Car;
import com.synisys.design_patterns.decorator_pattern.component.CarTunning;
import com.synisys.design_patterns.decorator_pattern.decorator.BandageTunning;
import com.synisys.design_patterns.decorator_pattern.decorator.ShieldTunning;

/**
 * Created by haykanush.torchyan on 11/25/2014.
 */
public class CarTunningTest {

    public static void main(String[] args){
        CarTunning car = new Car();

        car = new BandageTunning(new ShieldTunning(car));

        car.tune();

        //print the tunned spares
        car.printTunnedSpares();
    }
}
