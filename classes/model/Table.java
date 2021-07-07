package classes.model;

import java.util.Random;

/**
 * Table replesents the grid where BuscaCovid is played
 */
public class Table{
    Tile[][] grid;
    int size, numCovid;

    /**
     * Builds the table where BuscaCovid is played.
     * @param size size of the grid to be used
     */
    public Table(int size){
        this.size = size;
        grid = new Tile[size][size];
        numCovid = 0;
        fillCovid();
    }

    /**
     * Returns the grid in its current state.
     * @return grid in its current state
     */
    public Tile[][] getGrid(){
        return grid;
    }

    /**
     * Returns the value of the tile in the position entered
     * @param column column the tile is in
     * @param row row the tile is in
     * @return value of the tile (0-8: no Covid, 9: Covid)
     */
    public int getValueOfTile(int column, int row){
        return grid[column][row].getValue();
    }

    /**
     * Fills the grid with covid tiles randomly.
     */
    private void fillCovid(){
        Random rng = new Random();
        for(int column = 0; column < grid.length; column++){
            for(int row = 0; row < grid.length; row++){
                if(rng.nextInt(4) <= 1){
                    grid[column][row].setValue(9);
                    numCovid++;
                    sumOneToAdyacentTiles(column, row);
                }
            }
        }
    }

    /**
     * Adds 1 to the value of each tile adyacent to a Covid tile.
     * @param baseColumn the column the Covid tile is in
     * @param baseRow the row the Covid tile is in
     */
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

    /**
     * Reveals the tile selected.
     * @param column column the tile is in
     * @param row row the tile is in
     */
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

    /**
     * Checks if all tiles without Covid have been revealed. If that's the case, then the game has been won.
     * @return whether the game has been won (true) or not (false) 
     */
    public boolean checkVictory(){
        int tilesRevealed = 0;
        int tilesWithoutCovid = (size*size)-numCovid;
        for(int column = 0; column < grid.length; column++){
            for(int row = 0; row < grid.length; row++){
                if(grid[column][row].getValue() != 9 && grid[column][row].isRevealed() == true){
                    tilesRevealed++;
                }
            }
        }
        if(tilesRevealed == tilesWithoutCovid){
            return true;
        }
        else{
            return false;
        }
    }
}