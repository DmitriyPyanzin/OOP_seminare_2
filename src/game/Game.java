package game;

import game.Obstacles.*;
import game.Participant.*;
import game.Obstacles.Road.*;
import game.Obstacles.Rope.*;
import game.Obstacles.Swim.*;
import game.Obstacles.Wall.*;

class Game {

    /**
     * 0. Переварить весь код. +
     * 1. В пакете org.example.lesson2.game проделать такую же процедуру, как и с WallAdapter, для остальных препятствий. +
     * 2. Общие куски для препятствий вынести в какой-то базовый класс AbstractObstacle.
     * 3*. Придумать какой-то свой тип препятствия.
     * Проанализировать, что принципиально изменилось в структуре проекта при добавлении нового типа. +
     *
     */
    public static void main(String[] args) {
        // С оревнования между участниками
        // Есть полоса препятствий, которая состоит из дорожки (с длиной) и стены (с высотой)
        // Участники предолевают препятствия по очереди.

        Participant[] participants = createParticipans();
        Obstacle[] obstacles = CreateObstacles();

        for (Participant participant : participants) {
            System.out.print("\t" + participant.getName());
            System.out.println();
            int count = 0;
            for (Obstacle obstacle : obstacles) {
                boolean overcome = obstacle.overcome(participant);
                if(overcome) {
                    System.out.print(" преодолел препятствие \"" + obstacle.type() + "\"");
                    count++;
                } else {
                    System.out.print(" не справился с \"" + obstacle.type() + "\"");
                }
                System.out.println(",");
            }
            if (count == 4)
                System.out.println(" УРА!!!!! " + participant.getName() + " прошел все испытания.");
            else
                System.out.println(" ЭХ.... " + participant.getName() + " прошел всего " + count + " испытаний!");
            System.out.println();
        }
    }

    private static Participant[] createParticipans() {
        return new Participant[] {
                new Cat("Cat-1", 10, 2, 10),
                new Cat("Cat-2", 8, 5, 8),
                new Human("Human-1", 8, 5, 3, 9),
                new Cheater("Cheter-1"),
                new Human("Human-2", 9, 4, 5, 5),
                new Human("Human-3", 9, 5, 4, 6),
                new Snake("Snake-1", 9, 6, 7),
        };
    }

    private static Obstacle[] CreateObstacles() {
        return new Obstacle[] {
                new RoadObstacleAdapter(new Road(9)),
                new SwimmingPoolObstacleAdapter(new SwimmingPool(4)),
                new WallObstacleAdapter(new Wall(4)),
                new RopeObstacleAdapter(new RopeClimbing(6)),
        };
    }
}
