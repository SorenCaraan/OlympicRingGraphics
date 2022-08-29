// @author Soren Caraan

import javax.swing.JFrame;

public class OlympicRingViewer {

    public static void main(String[] args){

        JFrame frame = new JFrame();

        frame.setSize(500, 300);
        frame.setTitle("Olympic Rings Graphics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        OlympicRingComponent component = new OlympicRingComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
