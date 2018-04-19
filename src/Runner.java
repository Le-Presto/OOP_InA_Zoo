import java.util.ArrayList;

public class Runner {
    public static void main(String args[]) {

        ArrayList<Animal> animals = new ArrayList<Animal>();
        Zookeeper zoebot = new Zookeeper("Zoebot");

        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");

        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");

        Bee stinger = new Bee("Stinger");
        stinger.eat("ham");
        stinger.eat("pollen");

        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("pizza");
        gemma.eat("leaves");

        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("peppermint");
        rarity.eat("marshmallows");

        Bee barry = new Bee("Barry");

        animals.add(tigger);
        animals.add(pooh);
        animals.add(stinger);
        animals.add(gemma);
        animals.add(rarity);

        zoebot.feedAnimals(animals, "ramen");
    }
}
