
import java.util.Scanner;
    public class fatorial{

        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            
        int numero, fatorial;
            
        System.out.print("Digite um numero inteiro: ");

        numero = input.nextInt();

        fatorial = 1;

        for(int i = 1; i <= numero; i++) {

            fatorial *= i;

            System.out.print("Factorial of " + i + " is ");

            for (int i2 = i; i2 >= 1; i2--) {

                if (i2 == 1) {

                    System.out.print(i2 + " = ");

                 }else {

                        System.out.print(i2 + " x ");

                        }

                }

                System.out.println(fatorial);

            }
            
      }

}