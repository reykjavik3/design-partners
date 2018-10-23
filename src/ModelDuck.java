import interfacepack.FlyNoway;
import interfacepack.FlyWithWings;
import interfacepack.Quack;

/**
 * time : 2018-7-25
 * create by congrong.li
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flybehavior = new FlyNoway();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
