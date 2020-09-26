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
    public boolean run(int pDist) {
        System.out.println((pDist<runDistance)?"Робот пробежал дистанцию " +pDist:"Робот не пробежал дистанцию " + pDist);
        return pDist<runDistance;
    }

    @Override
    public boolean jump(int pDist) {
        System.out.println((pDist<jumpDistance)?"Робот перепрыгнул стену высотой "+pDist:"Робот не перепрыгнул стену высотой "+pDist);
        return pDist<jumpDistance;
    }

}
