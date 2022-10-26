import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel_exercicio_4_1_b extends JPanel {
    public void paintComponent( Graphics g ) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int offset = 15;
        int size = Math.max(width, height);
        
        for(int i = 0; i < size; i+=offset) {
            g.drawLine(0, i, i, height);
            g.drawLine(0, height - i, i, 0);
            g.drawLine(width, height - i,i, height);
            g.drawLine(width, height - i, width - i, 0);
        }
    }
}
