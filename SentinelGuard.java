
public class SentinelGuard {

    public enum GuardStatus {
        IDLE,
        PATROLLING,
        ATTACKING
    }

    private GuardStatus currentState;

    public SentinelGuard() {
        currentState = GuardStatus.IDLE;
    }

    public void hearNoise() {
        if (currentState == GuardStatus.IDLE) {
            currentState = GuardStatus.PATROLLING;
            System.out.println("Guard heard a noise and is investigating.");
        } else if (currentState == GuardStatus.PATROLLING) {
            System.out.println("Guard is already on alert.");
        } else if (currentState == GuardStatus.ATTACKING) {
            System.out.println("Guard is too busy fighting to notice the noise.");
        }
    }

    public void seeEnemy() {
        currentState = GuardStatus.ATTACKING;
        System.out.println("Guard spotted an enemy and is now attacking!");
    }

    public void loseTarget() {
        if (currentState == GuardStatus.ATTACKING) {
            currentState = GuardStatus.PATROLLING;
            System.out.println("Guard lost the enemy and is searching the area.");
        } else {
            System.out.println("No target to lose.");
        }
    }

    public void printState() {
        System.out.println("Current State: " + currentState);
    }
}
