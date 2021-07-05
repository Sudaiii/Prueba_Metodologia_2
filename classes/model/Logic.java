import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Logic {
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

    public void showGame(int[][] gameSpace){
        for (int x=0; x < gameSpace.length; x++) {
            System.out.print("|");
            for (int y=0; y < gameSpace[x].length; y++) {
              System.out.print (gameSpace[x][y]);
              if (y!=gameSpace[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
          }
    }

    public void saveGame(int discovered, int time) throws IOException{
        int score = 0;
        score = discovered * 100 - time * 100;
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            File file = new File("data.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(score + System.getProperty("line.separator"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
