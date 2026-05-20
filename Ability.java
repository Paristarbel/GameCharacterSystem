public class Ability {

    private String abilityName;
    private double damage;
    private int cooldown;

    public Ability(){
        this.abilityName="not found";
        this.damage=0.0;
        this.cooldown=0;
    }
    public Ability(String abilityName,double damage,int cooldown){
        this.abilityName=abilityName;
        this.damage=damage;
        this.cooldown=cooldown;
    }

    public String abilityName(){

        return abilityName;

    }
    public double damage(){

        return damage;

    }
    public int cooldown(){

        return cooldown;

    }
    public void updateDamage(double damage){

        if(damage <0){
            throw new IllegalArgumentException();
        }
        this.damage=damage;

    }
    public String toString(){
        return "Ability: "+abilityName() +", Damage: "+damage()+", Cooldown: "+cooldown()+" secs";
    }

}