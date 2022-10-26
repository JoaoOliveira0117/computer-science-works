import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel_exercicio_4_2_a extends JPanel {
    public void paintComponent( Graphics g ) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int offset = 15;
        int size = Math.max(width, height);
        int i = 0;

        while ( i < size) {
            g.drawLine(0, 0, i, height / i);
            i += offset;
        }
    }
}
