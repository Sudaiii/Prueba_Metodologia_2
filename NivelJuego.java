/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuscaMina;

/**
 *
 * @author nacho
 */
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
   
    
    public NivelJuego(){
        
        setSize(400,400);
        setTitle("Dificultad Juego");
        setLocationRelativeTo(null);
        
        iniciarComponentes();
         
    }
                      
    private void iniciarComponentes(){
        
        colocarLaminas();
        colocarBotones();
       
    }
    
    private void colocarLaminas(){
        
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        this.getContentPane().add(panel);
          
    }
   
    
    private void colocarBotones(){
        
        boton = new JButton("Principiante");
        boton.setBounds(120,70,150,40);
        panel.add(boton);
          
        
        boton2 = new JButton("Intermedio");
        boton2.setBounds(120,170,150,40);
        panel.add(boton2);
        
        boton3 = new JButton("Avanzado");
        boton3.setBounds(120,270,150,40);
        panel.add(boton3);
        
        
        ActionListener oyentedeaccion = new ActionListener(){
      
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                dispose();
                
                   
            }
        };
        
        boton.addActionListener(oyentedeaccion); 
        
        
        ActionListener oyentedeaccion2 = new ActionListener(){
      
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                dispose();
                
                   
            }
        };
        
        boton2.addActionListener(oyentedeaccion2); 
        
        
        ActionListener oyentedeaccion3 = new ActionListener(){
      
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                dispose();
                
                   
            }
        };
        
        boton3.addActionListener(oyentedeaccion3); 
        
        
    }
    
    
    
}
