
public class Main {
    public static void main(String[] args) {

        SentinelGuard guard = new SentinelGuard(true);

        System.out.println("=== Sentinel Guard Simulation ===");

        guard.printState();

        guard.seeEnemy();
        guard.printState();

        guard.loseTarget();
        guard.printState();

        guard.hearNoise();
        guard.printState();

        guard.seeEnemy();
        guard.printState();

        guard.loseTarget();
        guard.printState();
    }
}
