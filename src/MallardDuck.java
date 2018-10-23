import interfacepack.FlyWithWings;
import interfacepack.Quack;

/**
 * time : 2018-7-25
 * create by congrong.li
 */
public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flybehavior = new FlyWithWings();
    }

    @Override
    public void display() {

    }

}
