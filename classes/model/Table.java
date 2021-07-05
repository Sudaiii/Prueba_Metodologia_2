package classes.model;

import java.util.Random;

public class Table{
    int[][] grid;

    public Table(int size){
        grid = new int[size][size];
    }

    private void fillCovid(){
        Random rng = new Random();
        for(int[] columna: grid){
            for(int casilla: columna){
                if(rng.nextInt(4) <= 1){
                    casilla = 9;
                }
            }
        }
    }
}