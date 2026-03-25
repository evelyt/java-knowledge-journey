package classes.exercises.petmachine;

public class Pet {
    private String name;
    private boolean clean;

    //constructor
    public Pet(String name) {
        this.name = name;
        this.clean = false;
    }
    public boolean isClean() {
        return clean;
    }
    public void setClean(boolean clean) {
        this.clean = clean;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
