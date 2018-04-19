import java.util.ArrayList;

public class Zookeeper {
    //instance
    String name;

    //constructor
    public Zookeeper(String name){
        this.name = name;
    }

    //methods
    public void feedAnimals(ArrayList<Animal> animals, String food) {
        System.out.println(name + " is feeding " + food + " to " + animals.size() + " of " + Animal.population + " animals. ");
        for (Animal animal : animals) {
            animal.eat(food);
        }
    }
}
