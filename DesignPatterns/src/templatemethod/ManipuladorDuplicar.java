package templatemethod;

/**
 * 
 * @author Denilson | RA: 81612282
 *
 */
public class ManipuladorDuplicar extends ManipuladorAbstrato {

	protected String transformarString(String string) {
		return string + " " + string;
	}
}
