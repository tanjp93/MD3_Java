package AnimalAndEdible;

import edible.IEdible;

public class Tiger extends AnimalAndEdible.Animal implements IEdible {

    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }

    @Override
    public String howToEat() {
        return "could be 'nau cao !";
    }
}
