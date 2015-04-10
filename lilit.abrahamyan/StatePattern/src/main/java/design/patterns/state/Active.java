package design.patterns.state;

import design.patterns.state.AuthenticationResult.Result;

public class Active implements UserStatus {

	private Authentication authentication;
	
	public Active(Authentication authentication) {
		this.authentication = authentication;
	}	

	@Override
	public AuthenticationResult authenticate(String username, String password) {

		if (password != null && password.equals(Authentication.TST_PASSWORD)
				&& username != null
				&& username.equals(Authentication.TST_USERNAME)) {
			return new AuthenticationResult(Result.SUCCESS,
					"Successful authentication");
		}

		authentication.setStatus(authentication.getBlocked());
		return new AuthenticationResult(Result.FAIL, "User is blocked");
	}

}
