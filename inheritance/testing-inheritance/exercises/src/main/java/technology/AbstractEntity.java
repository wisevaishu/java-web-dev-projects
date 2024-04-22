package technology;

public abstract class AbstractEntity {
    public static int nextId = 1;
    private int id;

    public AbstractEntity() {
        this.id = generateId();
    }

    public abstract int generateId();
    public int getId() {
        return id;
    }
}
