package org.example;

public class Person {
    public String name;
    public int age;
    public String gender;
    public boolean hasDriverLicense;

    public  Person(String name , int age , String gender , boolean hasDriverLicense){
        this.name= name;
        this.age= age;
        this.gender= gender;
        this.hasDriverLicense= hasDriverLicense;
    }
    public void itISMe (){
        System.out.println("Hello ,My Name is " + name + " " +"and I am " + age + " years old.");
    }

}
