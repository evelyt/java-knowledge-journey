package classes.exercises.petmachine;

public class Pet {
    private String name;
    private boolean clean;

    public boolean isClean() {
        return clean;
    }
    public void setClean(boolean clean) {
        this.clean = clean;
    }
    public Pet(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
