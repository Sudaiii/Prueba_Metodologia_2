
package BuscaMina;


import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Menu extends JFrame {
    
    private JPanel panel;
   
    private JButton boton;
    private JButton boton2;
    private JButton boton3;
    
    public Menu(){
        
        setSize(400,400);
        setTitle("Menu Juego");
        setLocationRelativeTo(null);
        getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.WHITE));
        
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
        boton.setForeground(new Color(255,255,255));
        boton.setBackground(Color.green);
        panel.add(boton);
          
        
        boton2 = new JButton("Dificultad del Juego");
        boton2.setBounds(120,170,150,40);
        boton2.setForeground(new Color(255,255,255));
        boton2.setBackground(Color.green);
        panel.add(boton2);
        
        
        boton3 = new JButton("Salir del Juego");
        boton3.setBounds(120,270,150,40);
        boton3.setForeground(new Color(255,255,255));
        boton3.setBackground(Color.red);
        panel.add(boton3);
        
        
        ActionListener oyentedeaccion = new ActionListener(){
      
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                //interfaz del tablero
                dispose();
                
              
            }
        };
        
        boton.addActionListener(oyentedeaccion); 
        
        
        ActionListener oyentedeaccion2 = new ActionListener(){
      
            @Override
            public void actionPerformed(ActionEvent ae) {
                
               dispose();
                
                NivelJuego ventana = new NivelJuego();
                
                ventana.setVisible(true);
                ventana.setResizable(false);
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                   
            }
        };
        
        boton2.addActionListener(oyentedeaccion2); 
        
        
        
        ActionListener oyentedeaccion3 = new ActionListener(){
      
            @Override
            public void actionPerformed(ActionEvent ae) {
                
               System.exit(0);
                
            }
        };
        
        boton3.addActionListener(oyentedeaccion3); 
        
        
        
        
        
        
    }
}