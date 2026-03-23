package classes;

public class ClassesExamples {
    /*
    In Object-Oriented Programming (OOP), a class is a model, blueprint,
    or "template" that defines the characteristics (attributes) and behaviors
    (methods) that objects created from it will have.
     */
    public static void main(String[] args){

        var male = new Person("Joao",88); //Class Person
        var female = new Person("Maria");

        System.out.println("Male Name: "+ male.getName() + " age: "+ male.getAge());
        System.out.println("Female Name: "+ female.getName() + " age: "+ female.getAge());
    }
}
