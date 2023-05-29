import java.util.*;

public class Player {
    private String name;
    private int attackValue;
    private int health;

    Random random = new Random();

    public Player(String name, int health) {
        this.name = name;
        this.attackValue = random.nextInt(50);
        this.health = health;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Je suis le joueur " + name + " et j'ai " + attackValue + " d'attaque et " + health + " de vie.";
    }

    public int getAttackValue() {
        return attackValue;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(Player cible) {

        cible.health = cible.health - this.attackValue;

        // cible.health = (cible.health < 0) ? cible.health = 0 : cible.health;
        // math.max return la valeur la plus haute, si health <0 il retournera 0
        cible.health = Math.max(0, cible.health);
        System.out.println(
                this.name + " attaque à " + this.attackValue + ", il ne reste que " + cible.health + " de vie à "
                        + cible.name);
    }
}