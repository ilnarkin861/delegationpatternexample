package delegation;

public class StoppingAction implements ICharacterAction{

    @Override
    public void action() {
        System.out.println("I'm stopping");
    }
    
}
