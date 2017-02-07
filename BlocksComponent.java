import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

class BlocksComponent extends JComponent {
  
 // @Override
  protected void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;    
    
    Rectangle block_t1 = new Rectangle(20, 0, 20, 80);
    Rectangle block_t2 = new Rectangle(0, 0, 20, 40);
    Rectangle block_t3 = new Rectangle(0,0, 20, 60);
    
    Color cyan = new Color(CYAN);
    Color red = new Color(RED);
    Color yellow = new Color(YELLOW);
    Color green = new Color(GREEN);
    Color purple = new Color(MAGENTA);
    Color blue = new Color(BLUE);
    
    g2.translate(20, 40);
    g2.setPaint(cyan);
    g2.fill(block_t1);
      
      
  }
}
