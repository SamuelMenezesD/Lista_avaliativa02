import java.util.Scanner;
//Elabore um programa que leia 5 números do teclado e os armazene em um vetor.Em seguida,
// leia um número n qualquer e apresente na tela a quantidade de vezes que o número n aparece no vetor


public class Exercicio_05 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] num = new int[5];
        double n;

        for(int i = 0; i < 5; i++){
            System.out.println("Digite um numero para a posiçao"+i+": ");
            num[i] = leitor.nextInt();
        }
        System.out.println("Digite um outro numero para a variavel n: ");
        n = leitor.nextDouble();
        int quantidade = 0;
        for(int i = 0; i < 5; i++){
            if (num[i] == n) {
                quantidade++;                
            }
        }
        System.out.println("O numero " + n + " aparece " + quantidade + " vezes no vetor.");

        leitor.close();
    }
    
}
