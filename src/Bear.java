public class Bear extends Animal {
    //instance


    //constructor
    public Bear(String name) {
        super(name, "fish");
    }


    //methods
    public void sleep() {
        System.out.print(name + " hibernates for 4 months. ");
    }

    public static void main(String args[]) {
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
    }
}
