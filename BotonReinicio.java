import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BotonReinicio {
	
    final static JTextField text = new JTextField();
    static JPanel panel = new JPanel();
	public static void main(String s[]) {

	    JFrame frame = new JFrame("Screen");
	    panel.setLayout(new FlowLayout());

	    JLabel label = new JLabel();


	    text.setPreferredSize(new Dimension(100, 50));


	    panel.add(label);
	    panel.add(text);
	    reinicio();

	    frame.add(panel);
	    frame.setSize(300, 100);
	    frame.setLocationRelativeTo(null);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);

	}
	
	public static void reinicio() {
	    JButton restart = new JButton();
	    restart.setText("restart");

	    restart.addActionListener(new ActionListener()
	    {
	          public void actionPerformed(ActionEvent e)
	          {
	              text.setText(null);
	              /*
	               reiniciar...
	               puntaje
	               tablero
	               dificultad
	               */
	          }
	        });
	    panel.add(restart);
	}

}
