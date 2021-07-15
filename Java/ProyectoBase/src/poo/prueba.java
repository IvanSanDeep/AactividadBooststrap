package poo;

public class prueba {

	public static void main(String[] args) {
		//Instancias de clase 
		empleados trabajador1 = new empleados("Paco");
		empleados trabajador2 = new empleados("Ana");
		empleados trabajador3 = new empleados("Antonio");
		empleados trabajador4 = new empleados("Maria");
		
		trabajador1.cambiaSeccion("RRHH");
	
		System.out.println(trabajador1.devuelveDatos() + "\n" 
							+ trabajador2.devuelveDatos() + "\n" 
							+ trabajador3.devuelveDatos() + "\n" 
							+ trabajador4.devuelveDatos());
		
		System.out.println(empleados.dameIdSiguiente());

	}

}



class empleados{
	//Variables
	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente = 1;
	
	// constructor
	public empleados(String nom) {
		nombre = nom;
		seccion = "Administracion";
		Id = IdSiguiente;
		IdSiguiente++;
	}
	
	/*
	 * @setter cambiaSeccion
	 */
	public void  cambiaSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	
	/*
	 *@getter devuelveDatos 
	 */
	public String devuelveDatos() {
		return "El nombre es " + nombre + " y la seccion es " + seccion + " El Id es: " + Id;
	}
	
	/*
	 * @getter dameIdSiguiente estatico
	 */
	public static String dameIdSiguiente(){
		return "El Id Siguiete es: " + IdSiguiente;
	}

}

