import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class BlocksComponent extends JComponent {
  
 // @Override
  protected void paintComponent(Graphics g) {
    // recover Graphics2D
    Graphics2D g2 = (Graphics2D) g;    
    
    Rectangle block_I = new Rectangle(0, 0, 20, 80);
    Rectangle block_J = new Rectangle(0, 0, 20, 40);
    Rectangle block_L = new Rectangle(0, 0, 20, 60);
    Rectangle block_O = new Rectangle(0, 0, 20, 60);
    Rectangle block_S = new Rectangle(0, 0, 20, 60);
    Rectangle block_Z = new Rectangle(0, 0, 20, 60);
    Rectangle block_T = new Rectangle(0, 0, 20, 60);
    
    Color cyan = new Color(CYAN);
    Color red = new Color(RED);
    Color yellow = new Color(YELLOW);
    Color green = new Color(GREEN);
    Color purple = new Color(PURPLE);
    Color blue = new Color(BLUE);
    Color orange = new Color(orange);
    
    g2.translate(20, 40);
    g2.setPaint(cyan);
    g2.fill(block_t1);
      
      
  }
}
