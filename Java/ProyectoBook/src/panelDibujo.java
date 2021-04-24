import java.awt.Graphics;
import javax.swing.JPanel;

public class panelDibujo extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int anchura = getWidth();
		int altura = getHeight();
		
		for(anchura=1; anchura<15; anchura++) {
			for(int a=1; a<10; a++) {
				
				g.drawLine(0, a, anchura, altura);
				
				g.drawLine(0, altura, anchura, 0);
				
			}

		}
	}

}
