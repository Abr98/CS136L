import javax.swing
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.swing.JComponent;
class BlocksComponent extends JComponents {
  
  @Override
  protected void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;    
    
    g2.setColor(Color.CYAN);
    Rectangle block_t1 = new Rectangle(20, 0, 20, 80);
    g2.draw(block_t1);
    g2.fill(block_t1);
    
    
      
      
  }
}
