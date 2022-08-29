import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class OlympicRingComponent extends JComponent {

    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D) g;

        OlympicRing rings = new OlympicRing(25, 25, 90, 90);

        rings.draw(g2);
    }
}
