package acme;

import java.io.IOException;

/**
  * Funciona como un teléfono inteligente normal, pero también rastrea a los correcaminos.
  * <p>
  * El teléfono inteligente ACME puede realizar funciones similares a las de otros teléfonos inteligentes, como
  * como hacer llamadas telefónicas, enviar mensajes de texto y navegar por la web. Sin emabargo,
  * El teléfono inteligente ACME también permite el rastreo GPS de los correcaminos. Puedes monitorear
  * la ubicación de todos los correcaminos dentro de un radio de 20 millas usando el RoadRunner
  * Aplicación de seguimiento.
  * <p>
  * Tenga en cuenta que la aplicación RoadRunner Tracker requiere que esté conectado a wifi. Eso
  * no funcionará con datos móviles.
  *
  * @version 2.0
  * @since 1.3
  */
  
public class Smartphone {
	
	/**
        * Las coordenadas donde se encuentra el correcaminos más cercano.
        */
	
	public String LongLat = "Longitud = 39.2334, Latitud = 41.4899"; // hard-coded a Almeria city por simplicidad del ejemplo.
		
	double model;
	String license;
	
	/**
        * Crea e inicializa un nuevo Smartphone con el modelo y número de licencia adecuados.
        *
        * Ten en cuenta que si su licencia no es válida o si el modelo está obsoleto, los controles de zapping en el
        * el teléfono serán contraproducentes.
        *
        * @param model El modelo de Smartphone ACME que está inicializando.
        * @param license La licencia asociada con su Smartphone ACME.
        */
	public Smartphone(double model, String license) {
		this.model = model;
		this.license = license;
		System.out.println("modelo" + this.model + " se inicializó con la licencia " + license );
	}
	
	/**
	 * Obtiene las coordenadas geográficas de los correcaminos según su ciudad y pais. 
	 * 
	 * @param city la ciudad que desea buscar para los correcaminos
	 * @param state el país en el que desea buscar correcaminos
     * @param provincia
	 * @return las coordenadas del correcaminos más cercano en su área
	 * @throws IOException Devuelve una excepción si no puede encontrarse el país
	 */
	public String locateRoadRunner(String city, String state, String provincia) throws IOException {
			
		System.out.println("localización: " + city + ", " + provincia);
		System.out.println("obteniendo geocoordenadas del correcaminos.... ");
		System.out.println("correcaminos localizado en " + LongLat);
		return LongLat;
		
	}
        
	/**
         * Prepara una trampa electrica en las coordenadas indicadas. 
         * 
         * @param coor Las coordenadas del sitio donde se colocará la trampa.
         * @see #findRoadRunner
         */
        public void prepareTrap(String coor) {
            System.out.println("Trampa lista para ser activada en " + coor);
        }
        
       
        /**
         * Dispara al correcaminos con la cantidad de voltios que se
           especifiquen. <p> No exceda más de 30 voltios o la función de zap será
           contraproducente. </p>
         * 
         * @param voltage Voltage: indica el número de voltios que se enviarán al cuerpo del
           correcaminos.
         * @throws IOException IOException lanza excepción si no se introduce un valor entero para el
           numero de voltios. 
         * @see #prepareTrap
         */
	public void zapRoadRunner(int voltage) throws IOException {
		if (voltage < 31) {
			System.out.println("Golpeando al correcamnos con " + voltage + " voltios!!!!");
		}
		else {
			System.out.println("Oh no!!! El coyote ha sido golpeado con 1,000,000 voltios!!!!");
		}
	}

}
