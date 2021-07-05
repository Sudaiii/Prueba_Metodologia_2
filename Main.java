
package BuscaMina;


import javax.swing.JFrame;

public class Main {
    public static void main(String args[]){
        
        Menu ventana = new Menu();
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
}
