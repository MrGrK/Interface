package oop;

public class Treadmill implements IObstacle {
    private int distance;

    public Treadmill(int pDist){
        distance = pDist;
    }

    public int getDistance() {
        return distance;
    }
}

