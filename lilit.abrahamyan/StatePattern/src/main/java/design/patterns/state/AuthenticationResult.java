package design.patterns.state;

/**
 * 
 * @author lilit.abrahamyan
 * 
 */
public class AuthenticationResult {
	
	private Result result;
	private String message;
	
	public AuthenticationResult(Result result, String message) {
		super();
		this.result = result;
		this.message = message;
	}

	public Result getResult() {
		return result;
	}

	public String getMessage() {
		return message;
	}

	public enum Result {
		SUCCESS, FAIL;
	}
}