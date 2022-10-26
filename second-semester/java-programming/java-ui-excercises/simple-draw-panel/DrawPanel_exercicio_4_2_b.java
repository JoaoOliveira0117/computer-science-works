import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel_exercicio_4_2_b extends JPanel {
    public void paintComponent( Graphics g ) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int offset = 15;
        int size = Math.max(width, height);
        
        for(int i = 0; i < size; i+=offset) {
            g.drawLine(0, 0, i, height - i);
            g.drawLine(0, height, i, i);
            g.drawLine(width, height, width - i, i);
            g.drawLine(width, 0, width - i, height - i);
        }
    }
}
