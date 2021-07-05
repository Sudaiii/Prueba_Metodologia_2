
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


public class Menu extends JFrame {
    
    private JPanel panel;
   
    private JButton boton;
    private JButton boton2;
   
    
    public Menu(){
        
        setSize(400,400);
        setTitle("Menu Juego");
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
        
        boton = new JButton("Iniciar Juego");
        boton.setBounds(120,70,150,40);
        panel.add(boton);
          
        
        boton2 = new JButton("Dificultad del Juego");
        boton2.setBounds(120,170,150,40);
        panel.add(boton2);
        
        
        ActionListener oyentedeaccion = new ActionListener(){
      
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                //interfaz del tablero
              
            }
        };
        
        boton.addActionListener(oyentedeaccion); 
        
        
        ActionListener oyentedeaccion2 = new ActionListener(){
      
            @Override
            public void actionPerformed(ActionEvent ae) {
                
               
                NivelJuego ventana = new NivelJuego();
                
                ventana.setVisible(true);
                ventana.setResizable(false);
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                   
            }
        };
        
        boton2.addActionListener(oyentedeaccion2); 
        
        
    }
}