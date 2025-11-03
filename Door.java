public class Door {

    private String name;
    private String state;

    public Door(String newName, String newState) {
        name = newName;
        state = newState;
    }

    public void open() {
        state = "open";
    }

    public void close() {
        state = "closed";
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setState(String newState) {
        state = newState;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }
}