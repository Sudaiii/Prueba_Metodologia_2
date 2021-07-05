import java.util.Scanner;

public class Logica {
    public int levelSelector(){
        Scanner x = new Scanner(System.in);
        int option = 0;
        while (true){
            System.out.println("Seleccione dificultad: ");
            System.out.println("1. Principiante");
            System.out.println("2. Intermedio");
            System.out.println("3. Dificil");
            option = x.nextInt();
            if (option == 1){ return 9;}
            else if (option == 2){return 16;}
            else if (option == 3){return 32;}
            else{System.out.println("Opcion Invalida, intente nuevamente");}
        }
    }

    public void show(int[][] gameSpace){
        for (int x=0; x < gameSpace.length; x++) {
            System.out.print("|");
            for (int y=0; y < gameSpace[x].length; y++) {
              System.out.print (gameSpace[x][y]);
              if (y!=gameSpace[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
          }
    }
}
