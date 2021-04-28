package acme;

import java.io.IOException;

public class Persecucion {

	public static void main(String[] args) throws IOException {
		
		// Primero inicializamos un smartphone ACME con un código de licencia válido
		Smartphone miACMESmartphone = new Smartphone(2.0, COYOTE_398978FDSKJ);
		
		// Localizamos el correcaminos más cercano.
		String coordenadas=miACMESmartphone.locateRoadRunner(SEVILLA, SPAIN, SPAIN);
		
		// Preparamos la trampa
                miACMESmartphone.prepareTrap(coordenadas);
                
                // Golpear al correcaminos con el voltaje deseado.
		miACMESmartphone.zapRoadRunner(40);

	}
    protected static final String SEVILLA = "Sevilla";
    protected static final String SPAIN = "Spain";
    protected static final String COYOTE_398978FDSKJ = "coyote_398978fdskj";
        

}
