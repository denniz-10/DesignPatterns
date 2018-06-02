package abstractfactory;

/**
 * 
 * @author Denilson | RA: 816122383
 *
 */
public class TestAbstractPrinterFactory {
	public static void main(String[] args) {

		AbstractPrinterFactory printerFactory = new PrinterFactory();
		TextPrinter printer = printerFactory.getPrinterInstance("FILEPRINT");
		printer.print();

		System.out.println("************************************");

		printer = printerFactory.getPrinterInstance("SCREENPRINT");
		printer.print();
	}
}