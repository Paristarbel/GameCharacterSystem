public class OfflineArena extends Arena{

    public OfflineArena(String arenaName){
        super(arenaName);
    }
    @Override
    public void battle(BattleRequest request){
        System.out.println("Arena Name : " + arenaName()+", Character name: " + request.character().characterName() +"  unleashes "+ request.ability().abilityName()+ "  in an offline practice match!");
    }

}