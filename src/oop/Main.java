package oop;

import java.time.chrono.IsoChronology;
import java.util.Random;

public class Main {



    public static void main(String[] args) {

        ISkills[] xTeamArr = getTeamArr();

        IObstacle[] xObstArr = getObstacleArr();

        testTeam(xTeamArr, xObstArr);
    }

    private static void testTeam(ISkills[] xTeamArr, IObstacle[] xObstArr) {
        for (ISkills player: xTeamArr) {
            for (IObstacle obst: xObstArr) {
                if(!player.getObstacle(obst))
                    break;
            }
        }
    }

    private static IObstacle[] getObstacleArr() {
        Random xRand = new Random();
        IObstacle[] xArr = {new Wall(xRand.nextInt(20)+1),
                            new Treadmill(xRand.nextInt(100)+1),
                            new Wall(xRand.nextInt(20)+1),
                            new Treadmill(xRand.nextInt(100)+1),
                            new Wall(xRand.nextInt(20)+1),
                            new Treadmill(xRand.nextInt(100)+1) };
        return xArr;
    }

    private static ISkills[] getTeamArr() {
        Random xRand = new Random();
        ISkills[] xArr = {new Human(xRand.nextInt(100)+1,xRand.nextInt(3)+1 ),
                new Cat(xRand.nextInt(100)+1, xRand.nextInt(5)+1),
                new Robot(xRand.nextInt(100)+1, xRand.nextInt(25)+1),
                new Human(),
                new Cat(),
                new Robot() };
        return xArr;
    }
}
