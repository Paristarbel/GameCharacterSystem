public class BattleRequest {

    private int battleId;
    private Character character;
    private Ability ability;
    private BattleStatus status = BattleStatus.PENDING;


    public enum BattleStatus {
        PENDING,
        IN_PROGRESS,
        COMPLETED,
        CANCELLED
    }

    public BattleRequest() {

        this.battleId = 0;
        this.character = new Character();
        this.ability = new Ability();
        this.status = BattleStatus.PENDING;
    }

    public BattleRequest(int battleId, Character character, Ability ability) {

        this.battleId = battleId;
        this.character = character;
        this.ability = ability;
        this.status = BattleStatus.PENDING;
    }


    public int battleId() {

        return battleId;
    }

    public Character character() {

        return character;
    }

    public Ability ability() {

        return ability;
    }

    public BattleStatus status() {

        return status;
    }

    public void updateStatus(BattleStatus status) {

        this.status = status;
    }

    public String toString() {

        return "BattleId: " + this.battleId + " , Character name: " + this.character + " ,Ability name: " + this.ability + " , Status: " + this.status;
    }
}