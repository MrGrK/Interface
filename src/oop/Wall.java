package oop;

public class Wall implements IObstacle {
    private int height;

    public Wall(int pHeight){
        height = pHeight;
    }

    public int getHeight() {
        return height;
    }
}
