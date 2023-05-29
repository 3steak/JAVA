public class Game {
    public static void main(String[] args) {

        Player picsou = new Player("Picsou", 100);
        Player tigrou = new Player("Tigrou", 100);

        while (picsou.getHealth() > 0 && tigrou.getHealth() > 0) {

            picsou.attack(tigrou);

            if (tigrou.getHealth() > 0) {
                tigrou.attack(picsou);
            } else {
                System.out.println("Tigrou est mort");
            }
            if (picsou.getHealth() <= 0) {
                System.out.println("Picsou est mort");
            }
        }

        System.out.println(picsou);
        System.out.println(tigrou);
    }
}
