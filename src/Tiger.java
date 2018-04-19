public class Tiger extends Animal{
    //instance vars

    //constructor
    public Tiger(String name) {
        super(name, "meat");
    }

    //methods
    public static void main(String args[]){
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
    }
}
