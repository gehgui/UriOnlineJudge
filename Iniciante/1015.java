import java.io.IOException;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double x1, x2, y1, y2, distancia;
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        distancia = Math.hypot(x2-x1, y2-y1);
        System.out.printf("%.4f%n", distancia);
    }
}
