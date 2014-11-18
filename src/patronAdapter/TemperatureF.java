package patronAdapter;

class TemperatureF implements IFahr {  //implementación de la clase TemperatureFarenheit
	  double temperature;
	  public void setTemp(double temp) {
	    temperature = temp;
	  }
	  public double getTemp() {
	    return temperature;
	  }
	}