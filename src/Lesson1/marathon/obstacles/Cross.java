package Lesson1.marathon.obstacles;

import Lesson1.marathon.competitors.Competitor;

public class Cross implements Obstacle {
    private int dist;

    public Cross(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor c) {
        c.run(dist);
    }
}
