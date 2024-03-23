import java.util.Scanner;

//Escreva um algoritmo que leia em um vetor uma sequência finita de númerosdigitados pelo usuário e,
// logo após, mostre o número de cada posição do vetor e se ele é positivo, negativo ou zero

public class Exercicio_02 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("insira a quantidade de elementos do vetor: ");
        int quantidade = leitor.nextInt();

        int[] numinf = new int[quantidade];

        for (int i = 0; i < numinf.length; i++) {
            System.out.print("Digite o numero da posiçao " + i + ": ");
            numinf[i] = leitor.nextInt();
        }
        for (int i = 0; i < numinf.length; i++) {
            int numero = numinf[i];

            if (numero > 0) {
                System.out.println("Numero da posição " + i + ": " + numero + " (positivo)");
            } else if (numero < 0) {
                System.out.println("Numero da posição " + i + ": " + numero + " (negativo)");
            } else {
                System.out.println("Numero da posição " + i + ": " + numero + " (zero)");
            }
        }
        leitor.close();
    }
    
}
