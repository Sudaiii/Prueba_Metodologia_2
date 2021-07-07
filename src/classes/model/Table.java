package classes.model;

import java.util.Random;

public class Table{
    Tile[][] grid;

    public Table(int size){
        grid = new Tile[size][size];
        fillCovid();
    }

    public Tile[][] getGrid(){
        return grid;
    }

    private void fillCovid(){
        Random rng = new Random();
        for(int column = 0; column < grid.length; column++){
            for(int row = 0; row < grid.length; row++){
                if(rng.nextInt(4) <= 1){
                    grid[column][row].setValue(9);
                    sumOneToAdyacentTiles(column, row);
                }
            }
        }
    }

    private void sumOneToAdyacentTiles(int baseColumn, int baseRow){
        int[] movesi = {1, -1, 0};
        int[] movesj = {1, -1, 0};
        for(int i = 0; i < movesi.length; i++){
            if(baseColumn + movesi[i] >= 0 && baseColumn + movesi[i] < grid.length){
                for(int j = 0; j < movesj.length; j++){
                    if(baseRow + movesj[j] >= 0 && baseRow + movesj[j] < grid.length && (movesi[i] != 0 || movesj[j] != 0)){
                        grid[baseColumn + movesi[i]][baseRow + movesj[j]].sumOne();
                    }
                }
            }
        }
    }

    public void revealTile(int column, int row){
        if(grid[column][row].isRevealed())  return;
        grid[column][row].reveal();
        if(grid[column][row].getAdyacentCovid() == 0){
            int[] moves={-1,0,1};
            for(int i = 0; i < moves.length; i++){
                for(int j = 0; j < moves.length; j++){
                    if(column+moves[i]>=0 && column+moves[i] < grid.length && row + moves[j] >= 0 && row + moves[j] < grid.length){
                        revealTile(column + moves[i] , row + moves[j]);
                    }
                }
            }
        }
    }
}