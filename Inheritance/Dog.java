package Inheritance;
public class Dog extends Animal{

    private int tailWags;

    public Dog(String name, int age, int tailWags){
        // call to the super class constructor
        // this gives the super class the variables to store
        super(name, age);
        // set the specific Dog variables
        this.tailWags = tailWags;
    }

    public void speak(){
        System.out.println("WOOF WOOF");
    }

    public void howl(){
        System.out.println("AWOOOOOOO");
    }

    public String toString(){
        String output = "";
        // \n means "new line"
        output += "DOG\n";
        // call the toString from the Animal class
        output += super.toString() + "\n";
        // add more stuff to my output
        output += "Has wagged their tail " + this.tailWags + " times";
        return output;
    }
    
}
