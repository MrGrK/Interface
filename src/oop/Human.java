package oop;


public class Human implements ISkills{

    private int runDistance = 20;
    private int jumpDistance = 3;
    public Human(){

    }
    public Human(int pRunDist, int pJumpDist){
        runDistance = pRunDist;
        jumpDistance = pJumpDist;
    }

    @Override
    public boolean run(int pDist) {
        System.out.println((pDist<runDistance)?"Человек пробежал дистанцию " +pDist:"Человек не пробежал дистанцию " + pDist);
        return pDist < runDistance;
    }

    @Override
    public boolean jump(int pDist) {
        System.out.println((pDist<jumpDistance)?"Человек перепрыгнул стену высотой "+pDist:"Человек не перепрыгнул стену высотой "+pDist);
        return pDist < jumpDistance;
    }

}
