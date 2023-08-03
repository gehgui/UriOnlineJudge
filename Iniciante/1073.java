import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n;
        double quadrado;
        n = sc.nextInt();
        for(int i=2; i<=n; i=i+2){
            quadrado = Math.pow(i, 2);
            System.out.printf("%d^2 = %d%n", i, (int)quadrado);
        }
    }
}
