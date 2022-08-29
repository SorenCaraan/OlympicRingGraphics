import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

public class OlympicRing {

    private int x, y, z, e;

    public OlympicRing(int xSide, int ySide, int zSide, int eSide){

        x = xSide;
        y = ySide;
        z = zSide;
        e = eSide;
    }

    public void draw(Graphics2D g2){

        Ellipse2D.Double olRing1 = new Ellipse2D.Double(x,y,z,e);
        g2.setColor(Color.BLUE);
        g2.draw(olRing1);

        Ellipse2D.Double olRing2 = new Ellipse2D.Double(x + 50, y + 50, z, e);
        g2.setColor(Color.YELLOW);
        g2.draw(olRing2);

        Ellipse2D.Double olRing3 = new Ellipse2D.Double(x + 100, y, z, e);
        g2.setColor(Color.BLACK);
        g2.draw(olRing3);

        Ellipse2D.Double olRing4 = new Ellipse2D.Double(x + 150, y + 50, z, e);
        g2.setColor(Color.GREEN);
        g2.draw(olRing4);

        Ellipse2D.Double olRing5 = new Ellipse2D.Double(x + 200, y, z, e);
        g2.setColor(Color.RED);
        g2.draw(olRing5);
    }
}
