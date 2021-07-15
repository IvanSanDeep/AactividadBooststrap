package poo;

import javax.swing.*;

public class usoVehiculo {

	public static void main(String[] args) {
		
		coche micoche1 = new coche();
		
		micoche1.estableceColor("Rojo");
		
		furgoneta mifurgoneta1 = new furgoneta(7, 580);
		
		mifurgoneta1.estableceColor("azul");
		mifurgoneta1.configuraAsientos("s");
		mifurgoneta1.configuraClima("s");
		
		System.out.println(micoche1.dimeDatosGenerales() + " " + micoche1.dimeColor());
		System.out.println(mifurgoneta1.dimeDatosGenerales() + " " + mifurgoneta1.dimeDatosFurgoneta());
		
		
		//coche renault =new coche();//instancia
		//System.out.println("Este coche tiene " + renault.rueda + " ruedas");
		/*
		coche micoche = new coche();
		
		micoche.estableceColor(JOptionPane.showInputDialog("Introduce color"));
		
		System.out.println(micoche.dimeDatosGenerales());
		System.out.println(micoche.dimeColor());
		
		micoche.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		
		System.out.println(micoche.dimeAsientos()); 
		
		micoche.configuraClima(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		
		System.out.println(micoche.dimeClimetizador());
		System.out.println(micoche.dimePeso());
		System.out.println("El precio final del coche es: " + micoche.precioCoche());*/
	}

}
