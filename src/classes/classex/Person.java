package classes.classex;

import java.time.OffsetDateTime;

public class Person {
    //Created the variables of class Person
    private String name;
    private int age;
    private int lastYearAgrInc = OffsetDateTime.now().getYear();

    // constructor without arguments
    private Person(){}
    //constructor
    public Person(String name){
        this.name = name ;
        this.age = 1;
    }
    public Person(String name, int age){
        this.name = name ;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void incAge (){
        if(this.lastYearAgrInc >= OffsetDateTime.now().getYear()) return;
        this.age +=1;
        this.lastYearAgrInc = OffsetDateTime.now().getYear();
    }
}
