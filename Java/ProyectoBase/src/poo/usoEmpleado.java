
package poo;
import java.util.*;

public class usoEmpleado {

	public static void main(String[] args) {
		/*
		empleado empleado1 = new empleado("Paco G", 8500, 1990, 12, 17);
		empleado empleado2 = new empleado("Ana L", 9500, 1995, 06, 02);
		empleado empleado3 = new empleado("Maria G", 10500, 2000, 03, 15);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo() + 
							" Fecha de alta: " + empleado1.dameFechaContrato());
		System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo() + 
							" Fecha de alta: " + empleado2.dameFechaContrato());
		System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo() + 
							" Fecha de alta: " + empleado3.dameFechaContrato());
		*/
		jefatura jefeRRHH = new jefatura("Juan", 55000, 2006,9,25);
		
		jefeRRHH.estableceIncentivo(2570);
		
		empleado[] misEmpleados = new empleado[6];
		misEmpleados[0] = new empleado("Paco G", 8500, 1990, 12, 17);
		misEmpleados[1] = new empleado("Ana L", 9500, 1995, 06, 02);
		misEmpleados[2] = new empleado("Maria G", 10500, 2000, 03, 15);
		misEmpleados[3] = new empleado("Antonio F");
		misEmpleados[4] = jefeRRHH;  //Polimorfismo en acccion Principio de sustitucion
		misEmpleados[5] = new jefatura ("Maria",95000,1999,5,26);
		
		jefatura jefeFinazas = (jefatura) misEmpleados[5];
		jefeFinazas.estableceIncentivo(55000);
		
		/*for(int i=0; i<3; i++) {
			misEmpleados[i].subeSueldo(5);
		}*/
		//For mejorado
		for(empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		/*for(int i=0; i<3; i++) {
			System.out.println(	"Nombre: " + misEmpleados[i].dameNombre() + 
								" Sueldo: " + misEmpleados[i].dameSueldo() + 
								" Fecha de alta: " + misEmpleados[i].dameFechaContrato());
		}*/
		
		for(empleado e: misEmpleados) {
			System.out.println(	"Nombre: " + e.dameNombre() + 
								" Sueldo: " + e.dameSueldo() + 
								" Fecha de alta: " + e.dameFechaContrato());
		}
	}
}


class empleado{
	
	//Variables de clase
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
	
	//Constructor
	public empleado(String nom, double sue, int anio, int mes, int dia) {
		
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		altaContrato = calendario.getTime();
		++IdSiguiente;
		Id = IdSiguiente;
	}
	
	public empleado(String nom) {
		
		this(nom, 30000, 2000,01,01);
	}
		
	//Metodos getter
	public String dameNombre() {
		return nombre + " Id: " + Id;
	}
	
	public double dameSueldo() {
		return sueldo;
	}
	
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	//Metodo setter
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje/100;
		sueldo += aumento;
	}
	

}


class jefatura extends empleado{
	
	private double incentivo;
	
	//constructor
	public jefatura(String nom, double sue, int anio, int mes, int dia){
		  
		super(nom, sue, anio, mes, dia);
	}
	
	// getter establece el incentivo que se va hacer a jefatura
	public void estableceIncentivo(double b) {
		incentivo = b;
	}
	
	public double dameSueldo() {
		
		double sueldoJefe = super.dameSueldo();
		
		return sueldoJefe + incentivo;
	}
	

}

