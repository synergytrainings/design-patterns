package Humans;

/**
 * Created by Aram on 11/23/2014.
 */
public class Man implements Human {
    @Override
    public void Walk() {
        System.out.println("Man walks.");
    }

    @Override
    public void Talk() {
        System.out.println("Hi I'm a man!");
    }

    @Override
    public void Run() {
        System.out.println("Running fast!");
    }
}
