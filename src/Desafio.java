import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Desafio {

    void main() {
        Scanner sc = new Scanner(System.in);
        double media = 0;
        double soma = 0;
        double contador = 0;
        int numero;
        int maior = 0, menor = 99999;
        int[] temp = new int[11];

        for (int i = 1; i <= 10; i++) {
            IO.println("\nDigite sua " + i + "º temperatura");
            temp[i] = sc.nextInt();
            numero= (temp[i]);

            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            soma += temp[i];
            contador++;

        }

        IO.println("___________________________________________________________________");
        IO.println("");
        for (int i = 1 ; i < temp.length; i++) {
            Arrays.sort(temp);
            IO.println("Temperaturas digitadas: " + temp[i]);
        }
        IO.println("___________________________________________________________________");
        IO.println("");
        Arrays.sort(temp);
        for (int i = temp.length-1 ; i >0; i--) {
            IO.println("Temperaturas digitadas: " + temp[i]);
        }
        media = soma / contador;
        IO.println("___________________________________________________________________");
        IO.println("");
        IO.println("Maior temperatura: " + maior);
        IO.println("Menor temperatura: " + menor);
        IO.println("Média da temperatura: " + soma/contador);
        IO.println("");
        IO.println("___________________________________________________________________");
        IO.println("");
        for (int i = 1 ; i < temp.length; i++) {
            Arrays.sort(temp);

            if (temp[i] < media) {
                IO.println("Número menor que a média: " + temp[i]);
            }
        }
        IO.println("___________________________________________________________________");
        IO.println("");

        int busca = 0;
       while (busca != 1){
           IO.println("Digite uma temperatura existente no vetor: ");
           busca = sc.nextInt();

           for(int i = 0;i <=10;i++){
               if (temp[i] == busca){
                   IO.println("Temperatura existente!");
               }
            }
       }
    }
}