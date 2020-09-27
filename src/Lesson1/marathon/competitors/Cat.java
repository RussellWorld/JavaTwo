package Lesson1.marathon.competitors;

public class Cat implements Competitor {
    private String name;

    private int maxRunDistance;
    private int maxJumpHeight;

    private boolean onDistance;

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxJumpHeight = maxRunDistance;
        this.maxRunDistance = maxRunDistance;
        this.onDistance = true;
    }

    public Cat(String name) {
        this(name, 400, 3);
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.printf("%s успешно пробежал %d метров\n", name, dist);
        } else {
            System.out.printf("%s не смог пробежать %d метров\n", name, dist);
            onDistance = false;
        }

    }

    @Override
    public void jump(int dist) {
        if (dist <= maxJumpHeight) {
            System.out.printf("%s успешно прыгнул %d метров\n", name, dist);
        } else {
            System.out.printf("%s не смог прыгнуть %d метров\n", name, dist);
            onDistance = false;
        }

    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.printf("%s %b\n", name, onDistance);
    }
}
