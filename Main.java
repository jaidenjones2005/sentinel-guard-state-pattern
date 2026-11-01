
public class Main {
    public static void main(String[] args) {

        System.out.println("=== SENTINEL GUARD FINAL SIMULATION ===");

        // Start the guard sleeping
        SentinelGuard guard = new SentinelGuard(true);

        guard.printState();

        // Test sleeping behavior
        System.out.println("\n--- Sleeping State Tests ---");

        guard.seeEnemy();
        guard.printState();

        guard.loseTarget();
        guard.printState();

        guard.hearNoise();
        guard.printState();

        // Test patrolling behavior
        System.out.println("\n--- Patrolling State Tests ---");

        guard.hearNoise();
        guard.printState();

        guard.loseTarget();
        guard.printState();

        guard.seeEnemy();
        guard.printState();

        // Test attacking behavior
        System.out.println("\n--- Attacking State Tests ---");

        guard.hearNoise();
        guard.printState();

        guard.seeEnemy();
        guard.printState();

        guard.loseTarget();
        guard.printState();

        // Test idle behavior with a second guard
        System.out.println("\n--- Idle State Tests ---");

        SentinelGuard idleGuard = new SentinelGuard();

        idleGuard.printState();

        idleGuard.loseTarget();
        idleGuard.printState();

        idleGuard.hearNoise();
        idleGuard.printState();

        System.out.println("\n=== SIMULATION COMPLETE ===");
    }
}
