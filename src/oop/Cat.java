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
    public boolean run(int pDist) {
        System.out.println((pDist<runDistance)?"Кот пробежал дистанцию " +pDist:"Кот не пробежал дистанцию " + pDist);
        return pDist<runDistance;
    }

    @Override
    public boolean jump(int pDist) {
        System.out.println((pDist<jumpDistance)?"Кот перепрыгнул стену высотой "+pDist:"Кот не перепрыгнул стену высотой "+pDist);
        return pDist < jumpDistance;
    }

}
