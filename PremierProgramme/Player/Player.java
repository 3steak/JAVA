public class Player {
    private String name;
    private int attackValue;

    public Player(String name, int attackValue) {
        this.name = name;
        this.attackValue = attackValue;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Je suis le joueur " + name + " et j'ai " + attackValue + " d'attaque !";
    }
}