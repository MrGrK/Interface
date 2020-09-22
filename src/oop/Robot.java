package oop;

public class Robot implements ISkills {

    private int runDistance = 100;
    private int jumpDistance = 10;

    public Robot(){

    }
    public Robot(int pRunDist, int pJumpDist){
        runDistance = pRunDist;
        jumpDistance = pJumpDist;
    }

    @Override
    public void run(int pDist) {
        System.out.println((pDist<runDistance)?"Робот пробежал дистанцию " +pDist:"Робот не пробежал дистанцию " + pDist);

    }

    @Override
    public void jump(int pDist) {
        System.out.println((pDist<jumpDistance)?"Робот перепрыгнул стену высотой "+pDist:"Робот не перепрыгнул стену высотой "+pDist);

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
