
# Sentinel Guard NPC - State Pattern

## Phase 1: Conditional Logic

In Phase 1, I created a SentinelGuard class using an enum to track the guard's current state. I used if/else statements to control how the guard responds to different events.

The hearNoise() method checks three states, while loseTarget() checks whether the guard is attacking. The seeEnemy() method does not need a condition because it always changes the state to attacking.

The program works, but I can see how adding more states would make the code harder to manage. If I added a Sleeping or Panicked state, I would need to review all three trigger methods and update the ones affected by the new behavior.

This phase helped me understand why the State Pattern can make larger programs easier to maintain.

