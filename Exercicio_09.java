import java.util.Scanner;
//Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor C de acordo com as seguintes regras:

//Os elementos das posições pares de C são os elementos das posições pares de A;
//b. Os elementos das posições ímpares de C são os elementos das posições ímpares de B

public class Exercicio_09 {
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

        // A = [0, 1, 2, 3, 4]
        // B = [5, 6, 7, 8, 9]
        // C = [0, 6, 2, 8, 4]

        for(int i = 0;i < 5;i++){

            if (i % 2 == 0) {
                C[i] = A[i];
            }
            
            else{
                C[i] = B[i];
            }
           
        }
        System.out.println("Vetor C: ");
        for(int i = 0;i< 5;i++){
            System.out.print("," + C[i]);
        }


        leitor.close();
    }
    
}
