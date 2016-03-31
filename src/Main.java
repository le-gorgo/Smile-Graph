import controler.*;
import model.*;
import view.*;

public class Main{
	public static void main(String[] args) {
		System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
		Model model = new Model(); // Instanciation de notre mod�le
		Controler controler = new Controler(model);// Cr�ation du contr�leur
		Fenetre fen = new Fenetre(controler, model); // Cr�ation de notre fen�tre avec le contr�leur en param�tre
		controler.addView(fen);
	}
}
