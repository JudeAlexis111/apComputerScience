package com.jude.apcs.inheritance;

class Student{
    private String name;
    private int id;

    public Student(){}
    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public void printWelcome(){
        System.out.println("Welcome " + name);
    }
}

public class GradStudent extends Student{
    private String dissertationTopic;

    public GradStudent(String name, int id, String dissertationTopic){
        super(name, id);
        this.dissertationTopic = dissertationTopic;
    }

    public String getTopic(){
        return dissertationTopic;
    }

    public void setTopic(String newTopic){
        dissertationTopic = newTopic;
    }

    @Override
    public void printWelcome(){
        System.out.println("Welcome to graduate school! " + super.getName() + "!");
    }
}

class MainExec {
    public static void main(String[] args) {
        Student seabass = new Student("Jude",1352);
        System.out.println(seabass.getName());
        seabass.setName("Felssy");
        System.out.println(seabass.getName());
        seabass.printWelcome();

        Student tilapia = new GradStudent("Sebe",1543,"Marine Biology");
        tilapia.printWelcome();
    }
}