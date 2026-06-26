package CarInternal;

// PushStart.java
public class PushStart {
    private boolean pushed = false;

    public void push() {
        this.pushed = true;
    }

    public void release() {
        this.pushed = false;
    }

    public boolean isPushed() {
        return this.pushed;
    }
}