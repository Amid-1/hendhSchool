public class Player extends Creature {
    private int maxHealth;
    private int healCount;

    public Player(int attack, int defense, int health, int damageMin, int damageMax, int maxHealth) {
        super(attack, defense, health, damageMin, damageMax);
        this.maxHealth = maxHealth;
        this.healCount = 4;
    }

    public void heal() {
        if (healCount > 0 && getHealth() != maxHealth) {
            int healAmount = (int) (maxHealth * 0.3);
            setHealth(Math.min(getHealth() + healAmount, maxHealth));
            healCount--;
        }
    }
}
