package classes.exercises.petmachine;

public class PetMachine {
        private Pet pet;
        private int water = 30;
        private int shampoo = 10;
        private boolean clean = true;

    public PetMachine() {
    }

    public void verifyPet(){
        if(hasPet()){
            System.out.printf("The %s is in machine! %n", pet.getName());
        }else{
            System.out.println("There is not pet in machine!");
        }
    }

    public void addWater(){
        if(this.water == 30){
                System.out.println("It's not possible refuel the machine with water." +
                        "\nMaximum level reached!!");
            }else{
            this.water +=2;
        }
    }
    public void waterLevel(){
        System.out.println("Water Level: "+this.water+" liters");
    }
    public void addShampoo() {
        if(this.shampoo == 10){
            System.out.println("It's not possible refuel the machine with shampoo." +
                    "\nMaximum level reached!!");
        }else{
            this.shampoo +=2;
        }
    }
    public void shampooLevel(){
        System.out.println("Water Level: "+this.shampoo+" liters");
    }
    public boolean hasPet(){return this.pet != null;}

    public void bathingThePet(){
        if(!hasPet()){
            System.out.println("Add a pet to the machine");
            return;
        }
        if(this.water<10){
            waterLevel();
            return;
        }
        if(this.shampoo<2){
            shampooLevel();
            return;
        }
        this.water -=10;
        this.shampoo -=2;
        pet.setClean(true);
        System.out.println("The "+pet.getName()+" is clean!");
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public void setShampoo(int shampoo) {
        this.shampoo = shampoo;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public void setPet(Pet pet) {
        if(hasPet()){
            System.out.printf("The %s is on machine! %n", pet.getName());
            return;
        }
        if(!this.clean){
            System.out.println("Dirty machine! %n It's not possible to add a pet!");
            return;
        }
        this.pet = pet;
        System.out.println("The pet "+ pet.getName()+" was placed in the machine");
    }
}
