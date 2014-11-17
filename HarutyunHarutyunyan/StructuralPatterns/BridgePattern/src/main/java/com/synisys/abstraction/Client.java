package com.synisys.abstraction;
import java.util.Scanner;

import com.synisys.implementor.EmailMessageSender;
import com.synisys.implementor.SmsMessageSender;

public class Client {

	public static void main(String[] args) {

		System.out
				.println("Do you want to send 'longmessage' or 'shortmessage' ?");
		Scanner scanner = new Scanner(System.in);
		String messageType = scanner.next();

		System.out.println("Please enter the message you want to send");
		Scanner scanner1 = new Scanner(System.in);
		String message = scanner1.nextLine();

		if (messageType.equalsIgnoreCase("long")) {
			Message longMessage = new LongMessage(new EmailMessageSender());
			longMessage.sendMessage(message);
		} else {
			Message shortMessage = new ShortMessage(new SmsMessageSender());
			shortMessage.sendMessage(message);
		}

	}
}