public class Player {
    public String name;
    public int attackValue;
    public int health;

    public Player(String name, int attackValue, int health) {
        this.name = name;
        this.attackValue = attackValue;
        this.health = health;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Je suis le joueur " + name + " et j'ai " + attackValue + " d'attaque et " + health + " de vie.";
    }

    public void attack(Player cible) {
        cible.health = cible.health - this.attackValue;
        System.out.println(
                this.name + " attaque à " + this.attackValue + ", il ne reste que " + cible.health + " de vie à "
                        + cible.name);
    }
}