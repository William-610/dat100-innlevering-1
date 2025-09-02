import java.util.Scanner;

public class Trinnskatt {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Oppgi din bruttoinntekt (i kr): ");
        double inntekt = scanner.nextDouble();
        
        double skatt = 0;
        
        if (inntekt > 1410750) {
            skatt += (inntekt - 1410750) * 0.177;
            inntekt = 1410750;
        }
        
        if (inntekt > 942400) {
            skatt += (inntekt - 942400) * 0.167;
            inntekt = 942400;
        }
        
        if (inntekt > 697150) {
            skatt += (inntekt - 697150) * 0.137;
            inntekt = 697150;
        }
        
        if (inntekt > 306050) {
            skatt += (inntekt - 306050) * 0.04;
            inntekt = 306050;
        }
        
        if (inntekt > 217400) {
            skatt += (inntekt - 217400) * 0.017;
        }
        
        System.out.printf("Trinnskatt å betale: %.2f kr\n", skatt);
        
        //System.out.println("Du skrev inn: " + inntekt);
    }
}
