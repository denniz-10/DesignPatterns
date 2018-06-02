package observer;

/**
 * 
 * @author Denilson | RA: 816122383
 *
 */
public interface Subject {
	public void subscribeObserver(Observer observer);

	public void unSubscribeObserver(Observer observer);

	public void notifyObservers();

	public String subjectDetails();
}
