import com.synisys.training.patterns.mediator.NotificationCenter;
import com.synisys.training.patterns.mediator.User;
import com.synisys.training.patterns.mediator.api.SharingType;

public class Test {

	public void demo(){
		NotificationCenter notificationCenter = new NotificationCenter();

		User user1 = new User(1L, "user1", notificationCenter);
		User user2 = new User(2L, "user2", notificationCenter);

		user1.addPicture("http://example.com/images/12.png", SharingType.FRIENDS);
		user1.addPicture("http://example.com/images/34.png", SharingType.NONE);

		user2.tagUser("http://example.com/images/34.png", 2L);
	}
}
