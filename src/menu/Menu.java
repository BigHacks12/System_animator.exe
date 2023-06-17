
package menu;

import java.awt.Dimension;
import javax.swing.JFrame;
public class Menu {
 
   
    public static void main(String[] args) {
      tela(new JFrame());
      
     
      
    }
private static int height =100, width = 120, scale=4;
   
    public static void tela(JFrame frame){
      frame.setTitle("System_animator.exe");
      frame.setLocationRelativeTo(null);
      frame.setPreferredSize(new Dimension(width*scale, height*scale));
      frame.pack();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    }

 
   
    
}
