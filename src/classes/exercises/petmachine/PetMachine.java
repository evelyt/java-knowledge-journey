package classes.exercises.petmachine;

public class PetMachine {
        private Pet pet;
        private int water = 30;
        private int shampoo = 10;
        private boolean clean = true;

    public PetMachine() {
    }

    public boolean hasPet(){return this.pet != null;}

        public void takeAShower(){
            if(!hasPet()){
                System.out.println("Add a pet to the machine");
            }else{
                this.water -=10;
                this.shampoo -=2;
                pet.setClean(true);
                System.out.println("The "+pet.getName()+" is clean!");
            }
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
            System.out.printf("The %s%n is on machine!\n", pet.getName());
            return;
        }
        if(!this.clean){
            System.out.println("Dirty machine!\nIt's not possible to add a pet!");
            return;
        }
        this.pet = pet;
    }
}
