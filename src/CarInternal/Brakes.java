package CarInternal;

// Brakes.java
public class Brakes {
    private boolean applied = false;

    public void apply() {
        this.applied = true;
    }

    public void release() {
        this.applied = false;
    }

    public boolean isApplied() {
        return this.applied;
    }
}
