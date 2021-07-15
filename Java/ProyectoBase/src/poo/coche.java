package poo;

public class coche {
	
	public int rueda, largo, ancho, motor, pesoPlataforma;
	private String color;
	private int pesoTotal;
	private boolean asientosCuero, climatizador;
	
	//Constructor
	public coche() {
		
		rueda = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;		
		pesoPlataforma = 100;
	}
	
	//Metodo getter indicamos el dato que va a devolver
	public String dimeDatosGenerales() {
		return "La plataforma de vehiculo tiene " + rueda + " ruedas. Mide " +
				largo/1000 + " metros con un ancho de " + ancho + 
				" cm y un peso de paltaforma de " + pesoPlataforma + " kg";
	}
	
	//Metodo setter no devuelve el dato pero lo modificamos
	public void estableceColor(String colorCoche){
		color = colorCoche;
	}
	
	public String dimeColor() {
		return"El color de coche es "+ color;
	}
	
	//Metodo seter
	public void configuraAsientos(String asientosCuero) {
		if(asientosCuero.equalsIgnoreCase("s")) {
			this.asientosCuero = true;
		}else {
			this.asientosCuero = false;
		}
	}
	
	//Metodo getter
	public String dimeAsientos() {
		if(asientosCuero) {
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche tiene asientos de serie";
		}
	}
	
	//Metodo seter
	public void configuraClima(String climatizador) {
		if(climatizador.equalsIgnoreCase("s")){
			this.climatizador = true;
		}else {
			this.climatizador = false;
		}
	}
	
	//Metodo getter
	public String dimeClimetizador() {
		if(climatizador == true) {
			return "El coche incorpora climatizador";
		}else {
			return "El coche lleva aire acondicinado";
		}
	}
	
	public String dimePeso() {
		int pesoCarroceria = 500;
		pesoTotal = pesoPlataforma + pesoCarroceria;
		if(asientosCuero == true) {
			pesoTotal = pesoTotal + 500;
		}if(climatizador == true) {
			pesoTotal = pesoTotal + 20;
		}
		return "El peso del coche es " + pesoTotal;
	}
	
	public int precioCoche() {
		int precioFinal = 10000;
		
		if (asientosCuero == true) {
			precioFinal += 2000;
		}if(climatizador == true) {
			precioFinal += 1500;
		}
		return precioFinal;
	}

}
