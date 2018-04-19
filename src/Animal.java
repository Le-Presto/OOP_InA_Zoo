public class Animal {
    //instance vars
    String name;
    String favoriteFood;
    static int population = 0;

    //constructor
    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        population ++;
    }


    //methods
    public void sleep() {
        System.out.print(name + " sleeps for 8 hours. ");
    }

    public void eat(String food) {
        System.out.print(name + " eats " + food + ". ");
        if(food.equals(favoriteFood)) {
            System.out.println("YUM!!! " + name + " wants more " + food + ". ");
        } else {
            sleep();
        }
    }

    public static void main(String args[]){
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
    }
}
