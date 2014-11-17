import com.synisys.abstraction.LongMessage;
import com.synisys.abstraction.Message;
import com.synisys.abstraction.ShortMessage;
import com.synisys.implementor.EmailMessageSender;
import com.synisys.implementor.SmsMessageSender;

public class Test {

	public static void main(String[] args) {

			Message longMessage = new LongMessage(new EmailMessageSender());
			longMessage.sendMessage("Dear bla bla bla");
		
			Message shortMessage = new ShortMessage(new SmsMessageSender());
			shortMessage.sendMessage("SMS");
		

	}
}
