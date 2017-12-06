package personal.development.src.lambdas;

/**
 * Event listeners are nothing but interfaces with only 1 method in java
 * 
 * @author bdhavalshankh
 *
 */
public interface MyEventListener {

	public int onStateChange(int oldState, int newState);
}
