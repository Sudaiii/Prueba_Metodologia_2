package classes.model;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Game {
    Table table;
    //finished = 0: game isn't over.
    //finished = 1: game is over, player won.
    //finished = -1: game is over, player lost.
    int points, finished;

    public Game(int size){
        table = new Table(size);
        finished = 0;
        points = 0; //TO-DO: Determinar como puntuar al jugador
    }

    public int revealTile(int column, int row){
        if(finished == 0){
            table.revealTile(column, row);
            int tileValue = table.getValueOfTile(column, row);
            if(tileValue == 9){
                finished = -1;
            }
            else{
                if(table.checkVictory()){
                    finished = 1;
                }
            }
        }
        return finished;
    }

    public int levelSelector(){
        Scanner x = new Scanner(System.in);
        int option = 0;
        while (true){
            System.out.println("Seleccione dificultad: ");
            System.out.println("1. Principiante");
            System.out.println("2. Intermedio");
            System.out.println("3. Dificil");
            option = x.nextInt();
            if (option == 1){ 
                x.close();
                return 9;
            }
            else if (option == 2){
                x.close();
                return 16;
            }
            else if (option == 3){
                x.close();
                return 32;
            }
            else{
                System.out.println("Opcion Invalida, intente nuevamente");}
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
