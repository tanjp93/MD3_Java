package AnimalAndEdible;

import edible.IEdible;

public class MainAnimal {
    public static void main(String[] args) {
        Animal[] animals=new Animal[3];
        animals[0]=new Tiger();
        animals[1]=new Chicken();
        animals[2]=new Dog();
        for (Animal animal:animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                System.out.println(((Chicken) animal).howToEat());
            }
            if (animal instanceof Dog) {
                System.out.println(((Dog) animal).howToEat());
            }
        }
    }
}
