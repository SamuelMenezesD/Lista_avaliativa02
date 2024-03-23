import java.util.Scanner;
//Crie um programa que leia um vetor A de 5 posições e, ao final da leitura, copie os elementos de A em B
// de forma invertida. Ou seja, o primeiro elemento de A é o último elemento de B,
// o segundo elemento de A é o penúltimo elemento de B, e assimpor diante.
public class Exercicio_10 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int [5];

        for(int j = 0;j < 5;j++){
            System.out.println("Digite um numero para o vetor 1 na posição " + j + ": ");
            A[j] =leitor.nextInt();
        }
        int j = 4;
        for(int i = 0;i < 5;i++){
            B[i] = A[j];
            j--;
        }
        System.out.println("Vetor B: ");
        for(int i = 0;i<10;i++){
            System.out.println("," + B[i]);
        }


        


        leitor.close();
    }
    
}
