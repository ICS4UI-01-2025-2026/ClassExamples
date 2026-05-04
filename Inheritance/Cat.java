package Inheritance;
public class Cat extends Animal{
    private int lives;

    public Cat(String name, int age){
        // call to the Animal super class
        super(name, age);
        // set my own variables
        this.lives = 9;
    }

    public void speak(){
        System.out.println("MEOW");
    }

    public void pur(){
        System.out.println("PURRRRRRR");
    }
}
