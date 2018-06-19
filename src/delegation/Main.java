package delegation;

public class Main {

    public static void main(String[] args) {
        
        Character character = Character.getCharacter();
        character.setAction(new StoppingAction());
        character.setAction(new WalkingAction());
        character.setAction(new SleepingAction());

    }
    
}
