package interfacepack;

/**
 * time : 2018-7-25
 * create by congrong.li
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
