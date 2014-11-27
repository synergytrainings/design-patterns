package design.patterns.facade;

/**
 * Class for generating email bodies for registered user
 * 
 * @author lilit.abrahamyan
 * 
 */
public class EmailGenerator{
	
	public static final String STR_DEAR = "Dear";
	public static final String STR_BODY = "Your account has been created successfully";
	

	public String generateEmailBody(User user) {
		StringBuilder messageBody = new StringBuilder();
		messageBody.append(STR_DEAR);
		messageBody.append(user.getFirstName() + " ");
		messageBody.append(user.getLastName());
		messageBody.append(STR_BODY);
		return messageBody.toString();
		
	}

}
