package delegation;

public class SleepingAction implements ICharacterAction{

    @Override
    public void action() {
        System.out.println("I'm sleeping");
    }
    
}
