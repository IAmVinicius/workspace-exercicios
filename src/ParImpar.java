/* Faça um programa que peça N números inteiros,
 calcule e mostre a quantidade de números pares
 e a quantidade de números impares */
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantosNumeros;
        int numero = 0;
        int impar = 0, par = 0;

        System.out.println("Quantos números deseja? ");
        quantosNumeros = scan.nextInt();
        int count = 0;
        while(count < quantosNumeros){
            System.out.println("Número: ");
            numero = scan.nextInt();
               if(numero % 2 == 0) par++;
               else impar ++;
            count++;
        }

        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números impares: " + impar);
    }
}
