package Fruit;

public class FruitsMain {
    public static void main(String[] args) {
        Fruit[] fruits=new Fruit[]{new Orange(),new Apple()};
        for(Fruit fruit: fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
