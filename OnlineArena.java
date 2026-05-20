public class OnlineArena extends Arena{

    public OnlineArena(String arenaName){
        super(arenaName);
    }
    @Override
    public void battle(BattleRequest request){
        System.out.println(arenaName()+", "+ request.character().characterName() +"  unleashes "+ request.ability().abilityName()+ " in an online ranked match!");
    }

}
