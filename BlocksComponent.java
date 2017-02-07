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
    
    // draw 7 different rectangles
    g2.setColor(Color.CYAN);
    Rectangle block_I = new Rectangle(0, 0, 20, 80);
    g2.fill(block_I);
    
    g2.setColor(Color.BLUE);
    Rectangle block_J = new Rectangle(0, 0, 20, 40);
    g2.fill(block_J);
    
    g2.setColor(Color.ORANGE);
    Rectangle block_L = new Rectangle(0, 0, 20, 60);
    g2.fill(block_L);
    
    g2.setColor(Color.YELLOW);
    Rectangle block_O = new Rectangle(0, 0, 20, 60);
    g2.fill(block_O);
    
    g2.setColor(Color.GREEN);
    Rectangle block_S = new Rectangle(0, 0, 20, 60);
    g2.fill(block_S);
    
    g2.setColor(Color.RED);
    Rectangle block_Z = new Rectangle(0, 0, 20, 60);
    g2.fill(block_Z);
    
    g2.setColor(Color.RED);
    Rectangle block_T = new Rectangle(0, 0, 20, 60);
    g2.fill(block_T);
    
    /* don't think these are need
    Color cyan = new Color(CYAN);
    Color red = new Color(RED);
    Color yellow = new Color(YELLOW);
    Color green = new Color(GREEN);
    Color purple = new Color(PURPLE);
    Color blue = new Color(BLUE);
    Color orange = new Color(orange);*/
    
   
  }
}
