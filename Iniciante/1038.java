import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int cod, quant;
        double valor = 0;
        cod = sc.nextInt();
        quant = sc.nextInt();
        if(cod==1){
            valor = quant*4.0;
        }
        else if(cod==2){
            valor = quant*4.5;
        }
        else if(cod==3){
            valor = quant*5.0;
        }
        else if(cod==4){
            valor = quant*2.0;
        }
        else if(cod==5){
            valor = quant*1.5;
        }
        System.out.printf("Total: R$ %.2f%n", valor);
    }
}
