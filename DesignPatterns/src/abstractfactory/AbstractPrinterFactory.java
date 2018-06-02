package abstractfactory;

/**
 * 
 * @author Denilson | RA: 816122383
 *
 */
public interface AbstractPrinterFactory {
	TextPrinter getPrinterInstance(String printerType);

}
