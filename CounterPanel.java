import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CounterPanel extends JPanel {
  private JLabel countLabel;
  private int count;

  public CounterPanel(){
    JPanel mainPanel = new JPanel();
    setLayout(new BorderLayout());
    mainPanel.setPreferredSize(new Dimension (200,80));
    mainPanel.setBackground(new Color(196, 216, 226));

    count = 0;
    countLabel = new JLabel("Count: " + count);
    countLabel.setBounds(60, 20, 80, 50);
    mainPanel.add(countLabel);

    JButton countButton = new JButton("Increase Count");
    countButton.addActionListener(new CountListener());
    countButton.setBounds(25, 70, 150, 50);
    mainPanel.add(countButton);
  
    add(mainPanel, BorderLayout.CENTER);
    add(new JLabel("W1004: Java GUI Demo"), BorderLayout.PAGE_START);
  }
  private class CountListener implements ActionListener {
    public void actionPerformed(ActionEvent event){
      count += 1;
      countLabel.setText("Count: " + count);
    }
  }
}