
package com.synisys.training.patterns.command;

public class Turtle {

	public void move(int distance)
	{
		if (distance > 0){
			System.out.println(String.format("Turtle moved forwards %smm.", distance));
		} else {
			System.out.println(String.format("Turtle moved backwards %smm.", -distance));
		}
	}

	public void rotateLeft(double angle)
	{
		if (angle > 0){
			System.out.println(String.format("Turtle rotated left %s degrees.", angle));
		} else {
			System.out.println(String.format("Turtle rotated right %s degrees.", -angle));
		}
	}

	public void rotateRight(double angle)
	{
		if (angle > 0) {
			System.out.println(String.format("Turtle rotated right %s degrees.", angle));
		}
		else{
			System.out.println(String.format("Turtle rotated left %s degrees.", -angle));
		}
	}

}
