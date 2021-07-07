import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Insets;
 

 
  //—- Dependiendo del ancho también asignaré el número de bombas 
 
public class BotonReinicio extends JFrame {
	
	  private JPanel jPanel1 = new JPanel();
	  private JButton jButton1 = new JButton();
	  private int ancho=19;
	  private int alto=12;
	  public  JButton Botones[][]=new JButton [ancho][alto];
	  public  String [][] elArray =new String [ancho][alto];
	  
	
    final static JTextField text = new JTextField();
    static JPanel panel = new JPanel();
    
	public static void main(String s[]) {
		BotonReinicio TabBuscaMin = new BotonReinicio();
	    JFrame frame = new JFrame("Screen");
	    panel.setLayout(new FlowLayout());
	    
	    JLabel label = new JLabel();


	    text.setPreferredSize(new Dimension(100, 50));


	    panel.add(label);
	    panel.add(text);
	    reinicio();

	    frame.add(panel);
	    frame.setSize(500, 500);
	    frame.setLocationRelativeTo(null);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);

	}
	
	public static void reinicio() {
	    JButton restart = new JButton();
	    restart.setText("restart");
	    MouseListener mouseListener= new MouseListener(){
	          public void mouseClicked(MouseEvent evento)
	          {
	              text.setText(null);
	              if(evento.getClickCount()== 1){
	      			if(evento.getButton()==MouseEvent.BUTTON1){
	      				System.out.println("click izquierdo");         
	      			}
	      			if(evento.getButton()==MouseEvent.BUTTON3){			
	      				System.out.println("click derecho");
	      			}
	      		}
	              /*
	               reiniciar...
	               puntaje
	               tablero
	               dificultad
	               */
	          }

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
	        };
	        restart.addMouseListener(mouseListener);
	    panel.add(restart);
	}
}
