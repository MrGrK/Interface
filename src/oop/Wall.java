package oop;

public class Wall implements IObstacle {
    private int height;

    public Wall(int pHeight){
        height = pHeight;
    }

    @Override
    public boolean overcome(ISkills pSillable) {
        return pSillable.jump(height);
    }
}
