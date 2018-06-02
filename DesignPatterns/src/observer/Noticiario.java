package observer;

import java.util.Observable;

/**
 * 
 * @author Denilson | RA: 816122383
 *
 */
public abstract class Noticiario extends Observable {
	public abstract void notificaNoticia(String textoNoticia, int dia, int mes, String topico);

}
