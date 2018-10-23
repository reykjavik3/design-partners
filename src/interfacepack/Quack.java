package interfacepack;

/**
 * time :
 * create by congrong.li
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("这是quack");
    }
}
