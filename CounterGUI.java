import javax.swing.JFrame;

/**
 * <b>CounterGUI Class</b>
 * <p>
 * Creates a GUI for counting.
 * @author James Wen - jrw2175
 */

public class CounterGUI {
  public static void main(String[] args){
    JFrame counterFrame = new JFrame("Counter GUI");
    counterFrame.getContentPane().add(new CounterPanel());
    counterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    counterFrame.pack();
    counterFrame.setVisible(true);
  }
}