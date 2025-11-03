package seedu.address.model.id;

/**
 * Class to manage creation of auto-increment id, ensuring that unique id is always created.
 * Any class that contains an {@code Id} as a field should use exactly one {@code IdManager}.
 */
public class IdManager {
    /** The largest id that the class has encountered. */
    private Integer largest;

    /**
     * Constructs an {@code IdManager}.
     *
     * The first {@code Id} created will contain the value of 1.
     */
    public IdManager() {
        largest = 0;
    }

    /**
     * Create a new {@code Id}.
     * Returns null if no more unique Id can be created.
     */
    public Id getNewId() {
        if (!hasNextId()) {
            return null;
        }
        return new Id(++largest);
    }

    /**
     * Set the largest encountered id, if {@code id} has a larger id.
     */
    public void setLargest(Id id) {
        largest = Math.max(largest, id.value);
    }

    /**
     * Returns true if the maximum integer limit has been reached and no more Id can be created. False otherwise.
     */
    public boolean hasNextId() {
        return !(largest == Integer.MAX_VALUE);
    }

    /**
     * Resets the largest tracked Id value so that the next generated Id starts from 1 again.
     */
    public void reset() {
        largest = 0;
    }
}
