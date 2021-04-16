package com.jude.apcs.inheritance;

class Person {
    private String name;

    public Person(String theName){
        this.name = theName;
    }
    public String getName(){
        return name;
    }
}

public class Employee extends Person{
    private int id;
    public Employee(String name, int id){
        super(name);
        this.id = id;
    }
    public int getId(){
        return id;
    }
// other methods not shown
}

class Main {
    public static void main(String[] args) {
        Person p = new Person("Mike");
        System.out.println(p.getName()); // Mike
        Employee emp = new Employee("Dani", 123);
        System.out.println(emp.getName()); // Dani
        System.out.println(emp.getId()); // 123
        Person p1 = new Employee("Mike", 11);
    }
}