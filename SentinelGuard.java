
public class SentinelGuard {

    private GuardState currentState;

    public SentinelGuard() {
        currentState = new IdleState(this);
    }

    public void setState(GuardState state) {
        currentState = state;
    }

    public void hearNoise() {
        currentState.hearNoise();
    }

    public void seeEnemy() {
        currentState.seeEnemy();
    }

    public void loseTarget() {
        currentState.loseTarget();
    }

    public void printState() {
        System.out.println("Current State: " +
                currentState.getClass().getSimpleName());
    }
}
