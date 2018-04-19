//tutorial???

public class zoo {

    public static void main(String[] args) {
        zoo z = new zoo();
        z.sleep("Tigger");
        z.eat("Tigger", "meat");
        z.eat("Tigger", "bacon");
    }
    static String favoriteFood = "bacon";

    public static void sleep(String name) {
        System.out.print(name + " sleeps for 8 hours. ");
    }

    public static void eat(String name, String food) {
        System.out.print(name + " eats " + food + ". ");
        if(food.equals(favoriteFood)) {
            System.out.println("YUM!!! " + name + " wants more " + food + ". ");
        } else {
            sleep(name);
        }
    }
}
