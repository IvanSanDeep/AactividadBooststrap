import javax.swing.JFrame;

public class pruebaPanelDibujo {

	public static void main(String[] args) {
		
		panelDibujo panel = new panelDibujo();
		
		JFrame aplicacion = new JFrame();
		
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		aplicacion.add(panel);	//agrega el panel al marco
		aplicacion.setSize(250, 250); 	//establece el tamaño del marco
		aplicacion.setVisible(true);	//hace que el marco se visible
		

	}

}
