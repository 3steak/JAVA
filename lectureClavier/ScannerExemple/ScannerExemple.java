import java.util.*;

public class ScannerExemple {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Annee de naissance : ");
            int yearOfBirth = scanner.nextInt();
            System.out.println(yearOfBirth);

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
