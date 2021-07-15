import java.util.Scanner;

public class AplicacionCliente {

	public static void main(String[] args) {
		
		int eOpcion;
		int eTamano;
		ArregloCliente oArregloClientes;
		Scanner oTeclado = new Scanner(System.in);
		String sNombre;
		String sRFC;
		String sDomicilio;
		String sTelefono;
		Cliente oCliente;
		
		System.out.print("¿Cual es el tamaño del arreglo?  ");
		eTamano = oTeclado.nextInt();
		oArregloClientes = new ArregloCliente(eTamano);
		
		do {
			System.out.println("\nPrograma que actualiza arreglo de cliente");
			System.out.println("\nMenu: \n1. Agregar \n2.Borrar \n3.Modificar \n4.Listar \n5.Mostrar \n6.Salir \nIngrese una opccion");
			eOpcion = oTeclado.nextInt();
			
			switch(eOpcion){
			
			case 1:
				oCliente = leerCliente();
				oArregloClientes.agregar(oCliente);

			break;
			/*
			case 2:
				System.out.println("Ingresar la posicion del cliente que desee eliminar");
				eOpcion = oTeclado.nextInt();
				oArregloClientes.eliminarCliente();
			break;
			
			case 3:
				System.out.println("Ingresar la posicion del cliente que desee modoficar");
			break;
			*/
			case 4:
				System.out.println(oArregloClientes.getClientes());
			break;
			
			case 5:

			break;
			
			case 6:
				System.out.println("Bye");
			break;
			
			default:				
			}
		}while(eOpcion != 5);
		
	}
	
	public static Cliente leerCliente() {
		
		Scanner oTeclado = new Scanner(System.in);
		String sNombre;
		String sRFC;
		String sDomicilio;
		String sTelefono;
		Cliente oCliente;
		
		oTeclado.nextLine();
		System.out.print("Ingrese el nombre: ");
		sNombre = oTeclado.nextLine();
		System.out.print("Ingrese el RFC: ");
		sRFC = oTeclado.nextLine();
		System.out.print("Ingrese el domicilio: ");
		sDomicilio = oTeclado.nextLine();
		System.out.print("Ingrese el telefono: ");
		sTelefono = oTeclado.nextLine();
		
		oCliente = new Cliente(sNombre, sRFC, sDomicilio, sTelefono);
		
		return oCliente;
	}

}
