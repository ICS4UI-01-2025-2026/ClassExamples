package Inheritance;

public abstract class Animal{
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String toString(){
        return "" + this.name + " is " 
                  + this.age + " years old";
    }

    public abstract void speak();
}