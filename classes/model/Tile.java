package classes.model;

public class Tile {
    protected boolean state;
    protected int value;

    public Tile() {
        state = false;
        value = 0;
    }
    
    public boolean isRevealed() {
        return state;
    }

    public int getValue() {
        return value;
    }

    public void reveal() {
        state = true;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void sumOne(){
        value++;
    }
}
