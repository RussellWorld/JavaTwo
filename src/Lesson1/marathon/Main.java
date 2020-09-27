package Lesson1.marathon;

import Lesson1.marathon.competitors.Cat;
import Lesson1.marathon.competitors.Competitor;
import Lesson1.marathon.competitors.Human;
import Lesson1.marathon.competitors.Robot;
import Lesson1.marathon.obstacles.Cross;
import Lesson1.marathon.obstacles.Obstacle;
import Lesson1.marathon.obstacles.Wall;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {
                new Human("Tom"),
                new Cat("Barsik"),
                new Robot("M-1"),
                new Cat("Tigr",500,3),
                new Human("John Connor", 5000,15)
        };
        Obstacle[] obstacles = {
                new Cross(400),
                new Wall(1)
        };
        for (Competitor c : competitors){
            for (Obstacle o : obstacles){
                o.doIt(c);
                if (!c.isOnDistance()){
                    break;
                }
            }
        }
        for (Competitor competitor : competitors) {
            competitor.info();
        }
    }
}
