package design.patterns.state;

/**
 * 
 * @author lilit.abrahamyan
 *
 */
public class Authentication {
	
	public static final String TST_USERNAME = "admin";
	public static final String TST_PASSWORD = "123456";
	
	UserStatus waitingForApproval;
	UserStatus active;
	UserStatus blocked;
	
	UserStatus status;
	
	public Authentication() {
		waitingForApproval = new WaitingForApproval(this);
		active = new Active(this);
		blocked = new Blocked(this);
		
		status = waitingForApproval;
	}
	
	public void setStatus(UserStatus status) {
		this.status = status;
	}
	
	public UserStatus getActive() {
		return active;
	}
	
	public UserStatus getWaitingForApproval() {
		return waitingForApproval;
	}
	
	public UserStatus getBlocked() {
		return blocked;
	}
	
	AuthenticationResult authenticate (String username, String password) {
		return status.authenticate(username, password);
	}

}
