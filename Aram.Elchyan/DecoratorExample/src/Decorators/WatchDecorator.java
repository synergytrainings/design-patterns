package Decorators;

import Humans.Human;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Aram on 11/23/2014.
 */
public class WatchDecorator extends HumanDecorator {

    public WatchDecorator(Human human) {
        super(human);
    }

    @Override
    public void Talk() {
        Calendar cal = Calendar.getInstance();
        cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        super.Talk();
        System.out.println("My watch says that current time is " + sdf.format(cal.getTime()));
    }
}
