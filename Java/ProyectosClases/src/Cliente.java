
public class Cliente {
	//Variables
	private String sNombre;
	private String sRFC;
	private String sDomicilio;
	private String sTelefono;
	
	//Constructor
	public Cliente(String sNombre, String sRFC, String sDomicilio, String sTelefono) {
		setNombre(sNombre);
		setRFC(sRFC);
		setDomicilio(sDomicilio);
		setTelefono(sTelefono);
	}
	
	//Setter sNombre
	public void setNombre(String sNombre) {
		this.sNombre = sNombre;
	}
	
	//Setter sRFC
	public void setRFC(String sRFC) {
		this.sRFC = sRFC;
	}
	
	//Setter sDomicilio
	public void setDomicilio(String sDomicilio) {
		this.sDomicilio = sDomicilio;
	}
	
	//Setter sTelefono
	public void setTelefono(String sTelefono) {
		this.sTelefono = sTelefono;
	}
	
	//Getter devuelve nombre
	public String getNombre() {
		return sNombre;
	}
	
	//Getter devuelve RFC
	public String getRFC() {
		return sRFC;
	}
	
	//Getter devuelve domicilio
	public String getDomicilio() {
		return sDomicilio;
	}
	
	//Getter devuelve telefono
	public String getTelefono() {
		return sTelefono;
	}
	
	//getter toString devuelve nombre rfc domicilio telefono
	public String toStirng() {
		return sNombre + " " + sRFC + " " + sDomicilio + " " + sTelefono;
	}

}
