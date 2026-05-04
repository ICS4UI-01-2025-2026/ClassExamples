package Inheritance;
public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Spike", 4, 1000);
        Cat c1 = new Cat("Fluffy", 8);
        Cat c2 = new Cat("Snowball", 1);

        d1.speak();
        c1.speak();

        // polymorphism time!
        Animal[] animals = new Animal[3];
        animals[0] = d1;
        animals[1] = c1;
        animals[2] = c2;

        for(int i = 0; i < 3; i++){
            // can only do things Animal knows how
            animals[i].speak();
            // if we want to do Dog actions, need to convert it back
            // to check what type of class
            if(animals[i] instanceof Dog){
                // change the animal into a Dog by casting
                Dog d =(Dog)animals[i];
                d.howl();
            }
            
        }
    }
}
