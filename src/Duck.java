import interfacepack.FlyBehavior;
import interfacepack.QuackBehavior;

/**
 * time : 2078-7-25
 * create by congrong.li
 */
public abstract class Duck {
    FlyBehavior flybehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public FlyBehavior getFlybehavior() {
        return flybehavior;
    }

    public void setFlybehavior(FlyBehavior flybehavior) {
        this.flybehavior = flybehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void performFly(){
        flybehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("we can swim");
    }

}
