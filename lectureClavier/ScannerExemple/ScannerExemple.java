import java.util.Scanner;

public class ScannerExemple {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Annee de naissance : ");
        int yearOfBirth = scanner.nextInt();
        System.out.println(yearOfBirth);
    }
}
