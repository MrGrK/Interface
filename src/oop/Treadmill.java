package oop;

public class Treadmill implements IObstacle {
    private int distance;

    public Treadmill(int pDist){
        distance = pDist;
    }

    @Override
    public boolean overcome(ISkills pSillable) {
       return pSillable.run(distance);
    }
}

