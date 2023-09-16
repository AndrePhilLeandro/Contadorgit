import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

    Scanner digitar = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Digite o primeiro valor!");
    int valorUm = digitar.nextInt();

        System.out.println("Digite o segundo valor!");
            int valorDois = digitar.nextInt();

            int resultado = (valorUm - valorDois);

    if (resultado <= 0) {
                System.out.println("Primeiro valor não pode ser menor ou igual ao segundo valor!\nTente novamente");
     } else {

         for (int i = 1; i < resultado; i++){
            System.out.println(i);
         }
            
        }
    }
}