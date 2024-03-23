import java.util.Scanner;
//Elabore um programa que leia um vetor de 12 elementos apresente na tela o produto dos elementos pares positivos 
//(desconsiderar o zero).
// Exemplo: {0, 5, 8, 1, -6, 4, -7, 9, 10, -14, 3, 12} = 8 * 4 * 10 * 12 = 3840

public class Exercicio_12 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] A = new int[5];
        int multi = 1;
       

        for(int i = 0;i < 5;i++){
            System.out.println("Digite um numero para o vetor 1 na posição " + i+ ": ");
            A[i] =leitor.nextInt();
            if (A[i] < 0) {
            
                multi = multi * A[i];
            }
        }
        
        System.out.println("A multiplicação doas termos positivos é igual a: "+ multi);

        leitor.close();
    
    
    }
}
