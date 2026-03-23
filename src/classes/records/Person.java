package classes.records;

public record Person(String name, int age) {

    //compact constructor - use to validation values
    public Person{ //It can be empty.
        System.out.println(name);
        System.out.println(age);
        System.out.println("...");
    }

    public Person(String name) {
        this(name, 1);
    }

    public String getInfo(){
        return "Name: "+ name + " age: " +age;
    }

}
