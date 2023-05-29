public class Game {
    public static void main(String[] args) {

        Player picsou = new Player("Picsou", 100);
        Player tigrou = new Player("Tigrou", 100);

        while (picsou.health > 0 && tigrou.health > 0) {

            picsou.attack(tigrou);

            if (tigrou.health > 0) {
                tigrou.attack(picsou);
            } else {
                System.out.println("Tigrou est mort");
            }
            if (picsou.health <= 0) {
                System.out.println("Picsou est mort");
            }
        }

        System.out.println(picsou);
        System.out.println(tigrou);
    }
}
