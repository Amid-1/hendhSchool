import java.util.Random;

public class Creature {
    private int attack;
    private int defense;
    private int health;
    private int damageMin;
    private int damageMax;

    public Creature(int attack, int defense, int health, int damageMin, int damageMax) {
        this.attack = attack;
        this.defense = defense;
        this.health = health;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamageMin() {
        return damageMin;
    }

    public int getDamageMax() {
        return damageMax;
    }
    public int calculateAttackModifier(Creature defender) {
        int attackModifier = this.attack - defender.getDefense() + 1;
        return Math.max(attackModifier, 1);
    }

    public boolean checkSuccessfulHit(int attackModifier) {
        Random random = new Random();
        int diceCount = Math.max(attackModifier, 1);
        for (int i = 0; i < diceCount; i++) {
            int diceRoll = random.nextInt(6) + 1;
            if (diceRoll == 5 || diceRoll == 6) {
                return true;
            }
        }
        return false;
    }


    public void attackCreature(Creature defender) {
        int attackModifier = calculateAttackModifier(defender);
        if (checkSuccessfulHit(attackModifier)) {
            int damage = new Random().nextInt(damageMax - damageMin + 1) + damageMin;
            defender.setHealth(defender.getHealth() - damage);
        }
    }

    public void attack(Creature monster) {

    }
}
