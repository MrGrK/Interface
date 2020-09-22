package oop;

public class Cat implements ISkills {

    private int runDistance = 50;
    private int jumpDistance = 5;

    public Cat(){

    }
    public Cat(int pRunDist, int pJumpDist){
        runDistance = pRunDist;
        jumpDistance = pJumpDist;
    }

    @Override
    public void run(int pDist) {
        System.out.println((pDist<runDistance)?"Кот пробежал дистанцию " +pDist:"Кот не пробежал дистанцию " + pDist);

    }

    @Override
    public void jump(int pDist) {
        System.out.println((pDist<jumpDistance)?"Кот перепрыгнул стену высотой "+pDist:"Кот не перепрыгнул стену высотой "+pDist);

    }
    @Override
    public boolean getObstacle(IObstacle pObstacle){
        if(pObstacle instanceof Wall)
        {
            jump(((Wall) pObstacle).getHeight());
            return ((Wall) pObstacle).getHeight() < jumpDistance;
        }
        else if(pObstacle instanceof Treadmill)
        {
            run(((Treadmill) pObstacle).getDistance());
            return ((Treadmill) pObstacle).getDistance() < runDistance;
        }
        else return false;

    }

}
