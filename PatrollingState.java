
public class PatrollingState implements GuardState {

    private final SentinelGuard guard;

    public PatrollingState(SentinelGuard guard) {
        this.guard = guard;
    }

    @Override
    public void hearNoise() {
        System.out.println("Guard is already on alert.");
    }

    @Override
    public void seeEnemy() {
        System.out.println("Guard spotted an enemy and is now attacking!");
        guard.setState(new AttackingState(guard));
    }

    @Override
    public void loseTarget() {
        System.out.println("No target to lose.");
    }
}
