import javax.swing.*;
import java.awt.*;

class Mpanel extends JPanel{

	public static final int LEGNTH = 600;
	public static final int HALF = LEGNTH / 2;
	public static final int PER = LEGNTH / 20;

	public void paint(Graphics g) {

		//draw x,y line
		int i;
		g.drawLine(0,HALF,LEGNTH,HALF);
		g.drawLine(HALF,0,HALF,LEGNTH);

		for (i = 0;i < 20;i++) {
			g.drawLine(i * PER,HALF - 5,i * PER,HALF);
		}
		for (i = 0;i < 20;i++) {
			g.drawLine(HALF,i * PER,HALF + 5,i * 30);
		}

		//draw a,b
		Color color = new Color(255,0,0);
		g.setColor(color);
		g.drawLine(HALF,HALF,HALF + Vector.x1 * PER,Vector.y1 * PER);
		g.drawLine(HALF,HALF,HALF + Vector.x2 * PER,Vector.y2 * PER);

		g.drawString("A",HALF + Vector.x1 * PER + 5,Vector.y1 * PER + 5);
		g.drawString("B",HALF + Vector.x2 * PER + 5,Vector.y2 * PER + 5);

		//print info
		g.drawString(Vector.StringCoorA(),50,50);
		g.drawString(Vector.StringCoorB(),50,65);
		g.drawString(Vector.StringCoorAB(),50,80);
		g.drawString(Vector.StringCosAB(),50,95);
	}

}
