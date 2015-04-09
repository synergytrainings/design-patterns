package design.patterns.state;

import design.patterns.state.AuthenticationResult.Result;

public class Blocked implements UserStatus{
	
	private Authentication authentication;
	
	public Blocked(Authentication authentication) {
		this.authentication = authentication;
	}

	@Override
	public AuthenticationResult authenticate(String username, String password) {
		if (password != null && password.equals(Authentication.TST_PASSWORD)
				&& username != null
				&& username.equals(Authentication.TST_USERNAME)) {
			authentication.setStatus(authentication.getActive());
			return new AuthenticationResult(Result.SUCCESS,
					"Successful authentication");
		}
		
		return new AuthenticationResult(Result.FAIL, "User is blocked");
	}

}
