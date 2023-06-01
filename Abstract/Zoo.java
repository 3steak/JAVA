public class Zoo {
    public static void main(String[] args) {
        Cat fyvel = new Cat("Fyvel", "blue");
        System.out.println(fyvel.scream());
        System.out.println(fyvel.color());

        Tiger freedy = new Tiger("Freedy", "yellow");
        // System.out.println(freedy.scream());
        // System.out.println(freedy.color());
        System.out.println(freedy.medication("pills"));
        System.out.println(freedy.specialFood("fruits"));

    }
}
