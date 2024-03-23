import java.util.Scanner;
//labore um algoritmo que calcule o produto escalar entre dois vetores de inteiros de tamanho igual a 5.
// Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} = 0*1 + 2*3 + 4*5 + 6*7 +8*9 = 140

public class Exercicio_11 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int [5];
        int[] C = new int [5];

        for(int i = 0;i < 5;i++){
            System.out.println("Digite um numero para o vetor 1 na posição " + i+ ": ");
            A[i] =leitor.nextInt();
        }
        for(int i = 0;i < 5;i++){
            System.out.println("Digite um numero para o vetor 2 na posição " + i+ ": ");
            B[i] =leitor.nextInt();
        }

        for(int i = 0;i < 10;i++){

            C[i] = A[i]*B[i];
           
        }
        System.out.println("Vetor C: ");
        for(int i = 0;i<10;i++){
            System.out.println("," + C[i]);
        }

        leitor.close();
    }
    
}
