package pizzariafactory;/** *  * @author Denilson | RA: 816122383 * */public class PizzaioloCalabresa implements Pizzaiolo {	public Pizza criarPizza() {		return new PizzaCalabresa();	}	@Override	public Calzone criarCalzone() {		return new CalzoneCalabresa();	}}