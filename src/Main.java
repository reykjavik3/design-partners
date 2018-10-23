import interfacepack.FlyRocketPowered;

public class Main {

    public static void main(String[] args) {
        Duck d = new ModelDuck();
        d.performFly();
        d.setFlybehavior(new FlyRocketPowered());
        d.performFly();

    }
}
