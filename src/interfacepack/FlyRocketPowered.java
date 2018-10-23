package interfacepack;

/**
 * time : 2018-7-25
 * create by congrong.li
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
