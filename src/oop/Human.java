package oop;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.omg.CORBA.INTERNAL;

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
    public void run(int pDist) {
        System.out.println((pDist<runDistance)?"Человек пробежал дистанцию " +pDist:"Человек не пробежал дистанцию " + pDist);

    }

    @Override
    public void jump(int pDist) {
        System.out.println((pDist<jumpDistance)?"Человек перепрыгнул стену высотой "+pDist:"Человек не перепрыгнул стену высотой "+pDist);

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
