import java.util.Scanner;

//Construa um programa que leia em um vetor uma sequência de 5 números digitados pelo usuário, 
//calcule a média e apresente na tela quais valores são menores, iguaisou superiores à média.

public class Exercicio_01 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] num = new int[5];
        double soma = 0;
        
        for (int i = 0; i < num.length; i++){

            System.out.println("Digite o numero " + (i + 1) + ": ");
            num[i] = leitor.nextInt();
            soma += num[i];

        }
        double media = soma / num.length;

        System.out.println("Média: " + media);
        
        System.out.println("\nValores menores que a media:");
        for (int i = 0; i < num.length; i++) {
            if (num[i] < media) {
                System.out.println(num[i]);
            }
        }

        System.out.println("\nValores iguais a media:");
        for (int i = 0; i < num.length; i++) {
            if (num[i] == media) {
                System.out.println(num[i]);
            }
        }

        System.out.println("\nValores superiores a media:");
        for (int i = 0; i < num.length; i++) {
            if (num[i] > media) {
                System.out.println(num[i]);
            }
        }
        
        leitor.close();

    }
    
}
