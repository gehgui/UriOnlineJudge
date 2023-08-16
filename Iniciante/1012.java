import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double a, b, c, pi;
        double[] area = new double[5];
        String[] texto = {"TRIANGULO","CIRCULO","TRAPEZIO","QUADRADO","RETANGULO"};
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        pi = 3.14159;
        area[0] = (a*c)/2;
        area[1] = pi*Math.pow(c, 2);
        area[2] = ((a+b)*c)/2;
        area[3] = Math.pow(b, 2);
        area[4] = a*b;
        for(int i=0; i<5; i++){
            System.out.printf("%s: %.3f%n", texto[i], area[i]);
        }
    }
}
