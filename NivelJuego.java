
package BuscaMina;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class NivelJuego extends JFrame {
    
    private JPanel panel;
   
    private JButton boton;
    private JButton boton2;
    private JButton boton3;
    
    public String dificultad;
   
    
    public NivelJuego(){
        
        setSize(400,400);
        setTitle("Dificultad Juego");
        setLocationRelativeTo(null);
        
        iniciarComponentes();
         
    }
                      
    private void iniciarComponentes(){
        
        colocarLaminas();
        colocarBotones();
        colocarEtiqueta();
       
    }
    
    private void colocarLaminas(){
        
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        this.getContentPane().add(panel);
          
    }
   
    
      private void colocarEtiqueta(){
        
        
        JLabel etiqueta = new JLabel();
        etiqueta.setBounds(0,0,400,400);
        etiqueta.setBackground(Color.WHITE);
        ImageIcon virus = new ImageIcon ("virus.jpg");
        etiqueta.setIcon(new ImageIcon(virus.getImage().getScaledInstance(etiqueta.getWidth(), etiqueta.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(etiqueta);
       
    }
    
    private void colocarBotones(){
        
        boton = new JButton("Principiante (9x9)");
        boton.setBounds(120,70,150,40);
        panel.add(boton);
          
        
        boton2 = new JButton("Intermedio (16x16)");
        boton2.setBounds(120,170,150,40);
        panel.add(boton2);
        
        boton3 = new JButton("Avanzado (32x32)");
        boton3.setBounds(120,270,150,40);
        panel.add(boton3);
        
        
        ActionListener oyentedeaccion = new ActionListener(){
      
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                dificultad="9x9";
                dispose();
                
                   
            }
        };
        
        boton.addActionListener(oyentedeaccion); 
        
        
        ActionListener oyentedeaccion2 = new ActionListener(){
      
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                dificultad="16x16";
                dispose();
                
                   
            }
        };
        
        boton2.addActionListener(oyentedeaccion2); 
        
        
        ActionListener oyentedeaccion3 = new ActionListener(){
      
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                dificultad="32x32";
                dispose();
                
                   
            }
        };
        
        boton3.addActionListener(oyentedeaccion3); 
        
        
    }
    
    
    
}
