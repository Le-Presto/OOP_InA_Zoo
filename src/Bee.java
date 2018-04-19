public class Bee extends Animal {
    //instance


    //constructor
    public Bee(String name){
        super(name, "pollen");
    }


    //methods
    public void sleep() {
        System.out.print(name + " never sleeps. ");
    }

    public void eat(String food) {
        System.out.print(name + " eats " + food + ". ");
        if(food.equals(favoriteFood)) {
            System.out.println("YUM!!! " + name + " wants more " + food + ". ");
            sleep();
        } else {
            System.out.println( "YUCK!!! " + name + " will not eat " + food + ". ");
        }
    }
}
