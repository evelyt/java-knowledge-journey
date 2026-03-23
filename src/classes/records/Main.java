package classes.records;

public class Main {
    public static void main(String[] args){

        var personZero = new Person("Joao");
        var personOne = new Person("Maria",26);

        System.out.println(personZero);
        System.out.println(personZero.name());
        System.out.println(personZero.getInfo());
        System.out.println(personOne.getInfo());
    }
}
