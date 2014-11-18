package patronAdapter;

//este es el ADAPTER implementa Farenheit, la interfaz que ahora se requiere por cambio de backend
class TemperaturaToTemperatureAdapter implements IFahr {
		  TemperaturaC temperaturaCObject;  //agregación o compuesto del Adaptee
		  double tempConv;
		  
		  TemperaturaToTemperatureAdapter(TemperaturaC temperaturaCObject) //se necesita una referencia al objeto que se está encapsulando
		  {
		  	  this.temperaturaCObject = temperaturaCObject;
		  	  tempConv = this.temperaturaCObject.getTemperatura();
		  	  this.tempConv = (tempConv-32)/1.8;
		  }
		  
		  //se implementan los métodos de la interfaz Farenheit para imitar al objeto Acme
		public double getTemp() {
			return tempConv;
		}
		public void setTemp(double tempConv) {
			this.tempConv = tempConv;
		}
		  
		
	}