import java.io.IOException;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double n;
        n = sc.nextDouble();
        System.out.printf("NOTAS:%n");
        System.out.printf("%d nota(s) de R$ 100.00%n", (int)n/100);
        n %= 100;
        System.out.printf("%d nota(s) de R$ 50.00%n", (int)n/50);
        n %= 50;
        System.out.printf("%d nota(s) de R$ 20.00%n", (int)n/20);
        n %= 20;
        System.out.printf("%d nota(s) de R$ 10.00%n", (int)n/10);
        n %= 10;
        System.out.printf("%d nota(s) de R$ 5.00%n", (int)n/5);
        n %= 5;
        System.out.printf("%d nota(s) de R$ 2.00%n", (int)n/2);
        n %= 2;
        System.out.printf("MOEDAS:%n");
        System.out.printf("%d moeda(s) de R$ 1.00%n", (int)n/1);
        n = (n%1)*100;
        System.out.printf("%d moeda(s) de R$ 0.50%n", (int)n/50);
        n %= 50;
        System.out.printf("%d moeda(s) de R$ 0.25%n", (int)n/25);
        n %= 25;
        System.out.printf("%d moeda(s) de R$ 0.10%n", (int)n/10);
        n %= 10;
        System.out.printf("%d moeda(s) de R$ 0.05%n", (int)n/5);
        n %= 5;
        System.out.printf("%d moeda(s) de R$ 0.01%n", (int)n/1);
    }
}
