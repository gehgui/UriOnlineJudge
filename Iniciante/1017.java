import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int tempo;
        float litro, mediaKm;
        tempo = sc.nextInt();
        mediaKm = sc.nextFloat();
        litro = (tempo*mediaKm)/12;
        System.out.printf("%.3f%n", litro);
    }
}
