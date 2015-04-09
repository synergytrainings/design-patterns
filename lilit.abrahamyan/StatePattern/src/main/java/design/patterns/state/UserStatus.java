package design.patterns.state;

/**
 * @author lilit.abrahamyan
 *
 */
public interface UserStatus {

	AuthenticationResult authenticate (String username, String password);

}