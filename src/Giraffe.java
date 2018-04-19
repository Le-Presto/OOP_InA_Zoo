public class Giraffe extends Animal {
    //instance


    //constructor
    public Giraffe(String name){
        super(name, "leaves");
    }


    //methods
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
