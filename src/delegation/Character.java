package delegation;

public class Character {
    
    private static Character character = null;
    private ICharacterAction action;
    
    private Character(){}
    
    public void setAction(ICharacterAction action){
        this.action = action;
        start();
    }
    
    private void start(){
        action.action();
    }
    
    public static Character getCharacter(){
        if(character == null) character = new Character();
        return character;
    }
    
    
    
}
