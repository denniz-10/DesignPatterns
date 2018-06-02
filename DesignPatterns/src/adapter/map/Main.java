package adapter.map;

import java.util.Map;

/**
 * 
 * @author Denilson | RA: 816122383
 *
 */
public class Main {

	public static void main(String[] args) {
		Object[][] pares = new String[][] { { "Palmeiras", "Corinthians", "São Paulo", "Flamengo", "Vasco", "Fluminense" },
				{ "Campeão", "Ladrão", "Série B", "Lixo", "Falido", "Fraco" } };

		Map<?, ?> mapa = new NewMapAdapter(pares);
		
		for(Object key : mapa.keySet()) {
			System.out.println(key + " : " + mapa.get(key));
		}
	}

}
