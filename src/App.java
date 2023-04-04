import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        Locale.setDefault(Locale.US);

            double numero;

        System.out.println("Número que deseja verificar");
            numero = keyboard.nextDouble();
            
         if (numero > 0 ){

        System.out.println("Número é POSITIVO");

        } else if (numero < 0){
        System.out.println("Número é NEGATIVO");
        } else{
        System.out.println("Número é NEUTRO");
        }
    keyboard.close();

    }
}   