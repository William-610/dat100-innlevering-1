import java.util.Scanner;

public class Fakultet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n;

        // Sørg for at brukeren skriver inn et tall > 0
        while (true) {
            System.out.print("Skriv inn et heltall større enn 0: ");
            n = scanner.nextInt();

            if (n > 0) {
                break;
            } else {
                System.out.println("Ugyldig tall! Tallet må være større enn 0.");
            }
        }

        // Beregn fakultet
        int resultat = 1;

        for (int i = 1; i <= n; i++) {
            resultat *= i;  // Samme som resultat = resultat * i;
        }

        System.out.println(n + "! = " + resultat);

        scanner.close();
    }
}
