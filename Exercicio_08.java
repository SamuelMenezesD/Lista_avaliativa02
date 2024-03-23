import java.util.Scanner;
//Dados dois vetores A e B de 5 elementos cada, criar 
//um vetor C que representa aconcatenação de A e B, ou seja, 
//C contém os elementos de A seguidos dos elementos de B.
public class Exercicio_08 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int [5];
        int[] C = new int [10];

        for(int i = 0;i < 5;i++){
            System.out.println("Digite um numero para o vetor 1 na posição " + i+ ": ");
            A[i] =leitor.nextInt();
        }
        for(int i = 0;i < 5;i++){
            System.out.println("Digite um numero para o vetor 2 na posição " + i+ ": ");
            B[i] =leitor.nextInt();
        }

        for(int i = 0;i < 10;i++){

            if (i < 5) {
                C[i] = A[i];
                
            }
            else{
                C[i] = B[i];
            }
           
        }
        System.out.println("Vetor C: ");
        for(int i = 0;i<10;i++){
            System.out.println("," + C[i]);
        }

        leitor.close();
    }
    
}
