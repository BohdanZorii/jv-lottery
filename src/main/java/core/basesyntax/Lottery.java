package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random(100);
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt());
    }
}