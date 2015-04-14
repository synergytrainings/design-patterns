package main.com.synisys.trainings.designPatterns;

import main.com.synisys.trainings.designPatterns.impl.OperationCanceledException;

public interface PaymentStrategy {
	public void pay(int amount) throws OperationCanceledException;
}