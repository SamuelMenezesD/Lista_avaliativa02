import java.util.Scanner;

//Elabore um algoritmo que receba um número n e retorn e 
//um vetor com os n primeiros termos da sequência de Fibonacci.
// Exemplo: n = 8, vetor = {1, 1, 2, 3, 5, 8,13, 21}
public class Exercicio_13 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o numero n para recerber os n primeiro termos de Fibonacci: ");
        int n = leitor.nextInt();

        int[] fibo = new int[n];

        if (n >= 1) {
            fibo[0] = 1;
        }

        if (n >= 2) {
            fibo[1] = 1;
        }

        for(int i = 2;i < n; i++){
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        System.out.print("Sequencia de Fibonacci com os " + n + " primeiros termos: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo[i] + ", ");
        }

        

        leitor.close();
    }
    
}
