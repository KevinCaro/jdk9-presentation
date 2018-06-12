import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

JPanel jpanel = new JPanel();
JFrame frame = new JFrame("MyFrame");
JLabel myLabel = new JLabel("Hello Comptoir!", SwingConstants.CENTER);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add(myLabel, BorderLayout.CENTER);
frame.pack();
frame.setVisible(true);
