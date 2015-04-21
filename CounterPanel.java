import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CounterPanel extends JPanel {
  private JLabel countLabel;
  private JButton countButton;
  private int count;
  public CounterPanel(){
    setLayout(null);
    setPreferredSize(new Dimension (200,200));
    setBackground(new Color(196, 216, 226));

    count = 0;
    countLabel = new JLabel("Count: " + count);
    countLabel.setBounds(60, 20, 80, 50);
    add(countLabel);

    countButton = new JButton("Increase Count");
    countButton.addActionListener(new CountListener());    
    countButton.setBounds(25, 70, 150, 50);
    add(countButton);
  }
  private class CountListener implements ActionListener {
    public void actionPerformed(ActionEvent event){
      count += 1;
      countLabel.setText("Count: " + count);
    }
  }
}