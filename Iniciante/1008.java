import java.io.IOException;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int numFunc, hora;
        float valorHora, salario;
        numFunc = scan.nextInt();
        hora = scan.nextInt();
        valorHora = scan.nextFloat();
        salario = hora*valorHora;
        System.out.println("NUMBER = " + numFunc);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}
