
public class Main {
    public static void main(String[] args) {

        SentinelGuard guard = new SentinelGuard();

        guard.printState();

        guard.hearNoise();
        guard.printState();

        guard.hearNoise();
        guard.printState();

        guard.seeEnemy();
        guard.printState();

        guard.hearNoise();
        guard.printState();

        guard.loseTarget();
        guard.printState();

        guard.loseTarget();
        guard.printState();

        guard.seeEnemy();
        guard.printState();
    }
}
