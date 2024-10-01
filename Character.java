public class Character{

    private String characterName;
    private final int ID;
    private static int currentID = 400000;
    private int level;

    public Character(String characterName, int level){
        this.characterName = characterName;
        this.level = level;
        ID = currentID++;
    }

    public String getCharacterName(){
        return characterName;
    }

    public int getId(){
        return ID;
    }

    public int getLevel(){
        return level;
    }
}