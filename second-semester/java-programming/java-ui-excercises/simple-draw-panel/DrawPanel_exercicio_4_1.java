import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel_exercicio_4_1 extends JPanel {
    public void paintComponent( Graphics g ) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int offset = 15;
        
        for(int i = 0; i < offset; i++) {
            g.drawLine(0, (i * offset), (i * offset), height);
        }
    }
}
