public class Main {
    public static void main(String[] args) {
        Creature player = new Creature(20, 15, 100, 1, 6);
        Creature monster = new Creature(15, 10, 80, 1, 6);

        System.out.println("Player's initial health: " + player.getHealth());
        System.out.println("Monster's initial health: " + monster.getHealth());

        player.attackCreature(monster);
        System.out.println("Player attacks monster!");
        System.out.println("Monster's health after attack: " + monster.getHealth());

        monster.attackCreature(player);
        System.out.println("Monster attacks player!");
        System.out.println("Player's health after attack: " + player.getHealth());
    }
}

