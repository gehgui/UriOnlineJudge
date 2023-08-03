import java.io.IOException;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, r1, r2;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble(); 
        delta = Math.pow(b, 2) - (4*a*c);
        if(delta<0 || a==0){
            System.out.println("Impossivel calcular");
        }
        else{
            r1 = (-b + Math.sqrt(delta))/(a*2);
            r2 = (-b - Math.sqrt(delta))/(a*2);
            System.out.printf("R1 = %.5f%nR2 = %.5f%n", r1, r2);
        }
    }
}
