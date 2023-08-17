import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int x;
        float y, media;
        x = scan.nextInt();
        y = scan.nextFloat();
        media = x/y;
        System.out.printf("%.3f km/l%n", media);
    }
}
