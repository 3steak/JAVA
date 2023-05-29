public class Game {
    public static void main(String[] args) {
        Player picsou = new Player("Picsou", 30, 100);
        Player tigrou = new Player("Tigrou", 40, 100);
        // Picsou attack(OBJECT Tigrou);

        picsou.attack(tigrou);
        tigrou.attack(picsou);
        System.out.println(picsou);
        System.out.println(tigrou);
    }
}
