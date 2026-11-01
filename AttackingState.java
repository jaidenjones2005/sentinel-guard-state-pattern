
public class AttackingState implements GuardState {

    private final SentinelGuard guard;

    public AttackingState(SentinelGuard guard) {
        this.guard = guard;
    }

    @Override
    public void hearNoise() {
        System.out.println("Guard is too busy fighting to notice the noise.");
    }

    @Override
    public void seeEnemy() {
        System.out.println("Guard spotted an enemy and is now attacking!");
    }

    @Override
    public void loseTarget() {
        System.out.println("Guard lost the enemy and is searching the area.");
        guard.setState(new PatrollingState(guard));
    }
}
