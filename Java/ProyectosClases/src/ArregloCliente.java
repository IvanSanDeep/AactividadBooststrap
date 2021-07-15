
public class ArregloCliente {
	
	private int eTotal = - 1;
	private Cliente aCliente[];
	
	//Constructor
	public ArregloCliente(int eTamano) {
		
		aCliente = new Cliente[eTamano];
	}
	
	//Setter
	public void agregar(Cliente oCliente) {
		
		if(arregloLleno()) {
			System.out.println("Esta lleno");
		}else {
			eTotal++;
			aCliente[eTotal] = oCliente;
		}
	}
	
	public boolean arregloVacio() {
		
		return eTotal == -1;
	}
	
	//getter
	public boolean arregloLleno() {
		
		return eTotal == aCliente.length - 1;
	}
	
	//Setter
	public void modificarCliente(Cliente oCliente, int ePosicion) {
		
		if(eTotal == -1) {
			System.out.println("Arreglo vacio");			
		}else{
			aCliente[ePosicion] = oCliente;
		}
		
	}
	
	public String getClientes() {
		
		String sClientes ="";
		if(! arregloVacio()){
			for(Cliente oCliente: aCliente) {
				if(oCliente != null) {
					sClientes += oCliente.getNombre() + " " + oCliente.getRFC() + " " + oCliente.getDomicilio()
						+ " " + oCliente.getTelefono() + "\n";				
				}
			}
		}
		
		return sClientes;
	}
	
	public void eliminarCliente(int ePosicion) {
		
		int eNuevo;
		if(arregloVacio()){
			System.out.println("El arreglo esta vacio");
		}else {
			for(eNuevo = ePosicion; eNuevo < eTotal; eNuevo++) {
				aCliente[eNuevo] = aCliente[eNuevo + 1];
			}
			eTotal --;
		}
	}
	
	public Cliente getCliente(int ePosicion) {
		
		return aCliente[ePosicion];
	}

}
