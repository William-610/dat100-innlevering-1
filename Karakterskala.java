import java.util.Scanner;

public class Karakterskala {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lese poengsum for 10 ulike karakterer
        for (int i = 1; i <= 10; i++) {
            int poeng;
            
            // Leser kun inn gyldig poengsum (0 til 100)
            while (true) {
                System.out.print("Skriv inn poengsum for student " + i + " (0-100): ");  // Rettet parantes og kolon
                poeng = scanner.nextInt();
                
                if (poeng >= 0 && poeng <= 100) {  // Rettet 'peong' til 'poeng'
                    break; // Kun gyldig poengsum går videre
                } else {
                    System.out.println("Ugyldig poengsum. Vennligst skriv inn gyldig poengsum.");  // Rettet skrivefeil
                }
            }
            
            // Finn karakter basert på poengsum 
            char karakter;  // Rettet fra 'karater'
            if (poeng >= 90) {
                karakter = 'A';
            } else if (poeng >= 80) {
                karakter = 'B';
            } else if (poeng >= 60) {
                karakter = 'C';
            } else if (poeng >= 50) {
                karakter = 'D';
            } else if (poeng >= 40) {
                karakter = 'E';
            } else {
                karakter = 'F';
            }
            
            System.out.println("Student " + i + " fikk karakter: " + karakter);  // La inn mellomrom
            System.out.println();
        }
        
        scanner.close();
    }
}
