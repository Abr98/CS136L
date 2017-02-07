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
	// I block - using 1 rectangle object
    g2.setColor(Color.CYAN);
    Rectangle block_I = new Rectangle(0, 22*20, 80, 20);
    g2.fill(block_I);
	// second block_I
	block_I.translate(6*20,0);
	g2.fill(block_I);
	
	// J block - using 2 rectangle objects
    g2.setColor(Color.BLUE);
    Rectangle block_J1 = new Rectangle(1*20, 17*20, 60, 20);
	Rectangle block_J2 = new Rectangle(3*20, 18*20, 20, 20);
    g2.fill(block_J1);
	g2.fill(block_J2);
	// second block_J
	block_J1.translate(6*20,3*20);
    block_J2.translate(6*20,3*20);
    g2.fill(block_J1);
    g2.fill(block_J2);
	
	// L block - using 2 rect objects
    g2.setColor(Color.ORANGE);
    Rectangle block_L1 = new Rectangle(0*20, 16*20, 20, 60);
	Rectangle block_L2 = new Rectangle(1*20, 18*20, 20, 20);
    g2.fill(block_L1);
	g2.fill(block_L2);
	// second block_L
	block_L1.translate(5*20, 3*20);
	block_L2.translate(5*20, 3*20);
	g2.fill(block_L1);
    g2.fill(block_L2);
	
    // O block - using 1 rect object
    g2.setColor(Color.YELLOW);
    Rectangle block_O = new Rectangle(3*20, 19*20, 40, 40);
    g2.fill(block_O);
	// second block_O
	block_O.translate(4*20, -1*20);
	g2.fill(block_O);
    
	// S block - using 2 rect objects
    g2.setColor(Color.GREEN);
    Rectangle block_S1 = new Rectangle(0*20, 19*20, 20, 40);
	Rectangle block_S2 = new Rectangle(1*20, 20*20, 20, 40);
    g2.fill(block_S1);
	g2.fill(block_S2);
    // second block_S
	block_S1.translate(5*20, -2*20);
	block_S2.translate(5*20, -2*20);
	g2.fill(block_S1);
    g2.fill(block_S2);
	
	// Z block - using 2 rect objects
    g2.setColor(Color.RED);
    Rectangle block_Z1 = new Rectangle(3*20, 21*20, 40, 20);
	Rectangle block_Z2 = new Rectangle(4*20, 22*20, 40, 20);
    g2.fill(block_Z1);
	g2.fill(block_Z2);
	// second block_Z
	block_Z1.translate(2*20, -5*20);
	block_Z2.translate(2*20, -5*20);
	g2.fill(block_Z1);
    g2.fill(block_Z2);
	
	// T block - using 2 rect objects
    g2.setColor(Color.MAGENTA);
    Rectangle block_T1 = new Rectangle(2*20, 18*20, 20, 60);
	Rectangle block_T2 = new Rectangle(1*20, 19*20, 20, 20);
    g2.fill(block_T1);
	g2.fill(block_T2);
	// second block_T
	block_T1.translate(7*20, -2*20);
	block_T2.translate(7*20, -2*20);
	g2.fill(block_T1);
    g2.fill(block_T2);
   
  }
}
