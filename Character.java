public class Character {

    private String characterId;
    private String characterName;
    private double health;

    public Character(){
        this.characterId="not found";
        this.characterName="not found";
        this.health=0.0;

    }
    public Character(String characterId,String characterName,double health){
        this.characterId=characterId;
        this.characterName=characterName;
        this.health=health;

    }
    public String characterId(){

        return characterId;
    }
    public String characterName(){

        return characterName;
    }
    public double health(){

        if(health < 0){
            throw new IllegalArgumentException();
        }
        return health;
    }

    public String toString(){

        return "Character: " +this.characterName+"( "+this.characterId+" )"+", Health: "+this.health;
    }
}
