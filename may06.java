class Animal {
    public void animalSound() {
        System.out.println("Animal Class working");
    }
}

class Dog extends Animal {
    public void animalSound() {
        super.animalSound();
        System.out.println("Dog class working");
    }
}

public class may06 {
    public static void main(String args[]) {
        Animal myDog = new Dog(); 
        myDog.animalSound();
    }
}