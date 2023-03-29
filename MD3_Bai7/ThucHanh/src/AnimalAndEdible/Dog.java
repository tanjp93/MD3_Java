package AnimalAndEdible;

import edible.IEdible;

public class Dog extends  Animal implements IEdible {
    @Override
    public String makeSound() {
        return "Dog :woan woan";
    }
    @Override
    public String howToEat(){
        return  "could be ''nấu giã cày''";
    }
}
