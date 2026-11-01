
# Sentinel Guard NPC - State Pattern

## Phase 1: Conditional Logic

In Phase 1, I created a SentinelGuard class using an enum to track the guard's current state. I used if/else statements to control how the guard responds to different events.

The hearNoise() method checks three states, while loseTarget() checks whether the guard is attacking. The seeEnemy() method does not need a condition because it always changes the state to attacking.

The program works, but I can see how adding more states would make the code harder to manage. If I added a Sleeping or Panicked state, I would need to review all three trigger methods and update the ones affected by the new behavior.

This phase helped me understand why the State Pattern can make larger programs easier to maintain.


## Phase 2: Architecture Transition

In Phase 2, I refactored the SentinelGuard system to use the State Pattern instead of conditional statements.

The SentinelGuard class acts as the Context. It stores the current state and delegates actions to the appropriate state object.

The IdleState, PatrollingState, and AttackingState classes each handle their own behavior and transitions.

I think this approach is cleaner because SentinelGuard no longer needs to check which state it is in. Each state class is responsible for its own logic, making the code easier to organize and expand.

Although this approach requires more classes, it should make adding new states easier without changing the main guard logic.


## Phase 3: Expanding the System

In Phase 3, I added a SleepingState class to give the guard a new behavior.

While sleeping, the guard ignores enemies and lost targets. However, hearing a noise wakes the guard up and changes its state to Patrolling.

This phase demonstrates the Open/Closed Principle because I extended the system by adding a new class instead of changing the logic inside the existing state classes.

I only needed to create SleepingState and update SentinelGuard and Main to support and test the new starting state.

IdleState, PatrollingState, and AttackingState remained completely unchanged.

I can see how the State Pattern makes adding new behaviors easier without affecting existing ones.


## Phase 4: Validation & Reflection

In Phase 4, I tested the Sentinel Guard system to make sure all state transitions worked correctly.

I simulated the guard starting in SleepingState and tested how it reacted to seeing enemies, losing targets, and hearing noises.

I also tested the Idle, Patrolling, and Attacking states to verify that actions that should be ignored did not cause incorrect transitions.

Comparing Phase 1 to Phase 4, I think the State Pattern is more extensible for a professional software project.

In Phase 1, I had to use conditional statements to check the guard's current state. This worked for a small program, but adding more states would make the code harder to maintain.

With the State Pattern, each state has its own class and handles its own behavior. This makes it easier to add new states without rewriting existing logic.

The State Pattern was a little harder to understand at first because it required more classes and objects. However, once I understood how SentinelGuard delegates actions to the current state, the structure made more sense.

Overall, I prefer the State Pattern for larger projects because it keeps the code organized, reusable, and easier to expand.
