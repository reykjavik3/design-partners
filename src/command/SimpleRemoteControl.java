package command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public SimpleRemoteControl(Command slot) {
        this.slot = slot;
    }

    public void setCommand(Command command) {
        this.slot = command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
