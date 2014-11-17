package design.patterns.bridge;
/**
 * Implementer interface for sending notifications to bank's clients
 * 
 * @author lilit.abrahamyan
 *
 */
public interface NotificationSender {
	
	void sendNotification(Contact contact);
}
