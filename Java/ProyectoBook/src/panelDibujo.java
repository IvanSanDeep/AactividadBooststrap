import java.awt.Graphics;
import javax.swing.JPanel;

public class panelDibujo extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int anchura = getWidth();
		int altura = getHeight();
		
		g.drawLine(0, 0, anchura/15, altura);
		g.drawLine(0, 0, anchura/8, altura);
		//g.drawLine(0, 0, anchura/2, altura/3);
		//g.drawLine(0, 0, anchura/2, altura/2);
		//g.drawLine(0, 0, anchura/2, altura/2);
		//g.drawLine(0, altura, anchura, 0);

	}

}
