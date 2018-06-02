package abstractfactory;

/**
 * 
 * @author Denilson | RA: 816122383
 *
 */
public class ScreenPrintTextPrinter implements TextPrinter {

	@Override
	public void print() {
		System.out.println("Screen Print");
	}

}
