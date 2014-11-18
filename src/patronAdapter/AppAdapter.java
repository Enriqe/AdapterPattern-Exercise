package patronAdapter;

public class AppAdapter { //This is the modified client
	  public static void main(String args[]) {
		  //se crea un objeto Celsius
		  TemperaturaC temperaturaCObject = new TemperaturaC();
		  temperaturaCObject.setTemperatura(88);
		  //se encapsula (wrap) el objeto ace en uno ferenheit adapter para que lo pueda usar el cliente
		  //el cliente cree que está accediendo a un objeto Farenheit
		  TemperaturaToTemperatureAdapter adapter = new TemperaturaToTemperatureAdapter(temperaturaCObject);
		  System.out.println("Temperatura a convertir: " + adapter.getTemp());
		  //prueba final pasando el objeto Celsius como Farenheit
		  testTemperatureObject(adapter);
		      
	  }
	  
	  public static void testTemperatureObject(IFahr temperature)
	  {
		  System.out.println("la temperatura en testTemperatureObject es " + temperature.getTemp());
	  }
	} 