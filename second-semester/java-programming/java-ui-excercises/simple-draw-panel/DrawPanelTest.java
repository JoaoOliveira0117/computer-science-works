import javax.swing.JFrame;

public class DrawPanelTest {
    public static void main(String args[]) {
        DrawPanel_exercicio_4_2_a panel = new DrawPanel_exercicio_4_2_a();

        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(250,250);
        application.setVisible(true);
    }
}