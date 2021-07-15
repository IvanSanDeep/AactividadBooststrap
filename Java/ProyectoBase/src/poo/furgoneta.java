package poo;

public class furgoneta extends coche{
	
	private int capacidadCarga;
	private int plazasExtra;
	
	//Constructor
	public furgoneta(int plazasExtra, int capacidadCarga) {
		super();//Llamar al constructor de la clase padre;
		
		this.capacidadCarga = capacidadCarga;
		this.plazasExtra = plazasExtra;
	}
	
	//Setter
	public String dimeDatosFurgoneta() {
		
		return "La capacidad de carga es: " + capacidadCarga + 
				"\n Y las plazas son:" + plazasExtra;
	}

}
 