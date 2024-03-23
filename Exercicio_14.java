import java.util.Scanner;
//Faça um programa que leia um vetor de 5 elementos e, após a leitura, 
//posicione o maior elemento na última posição do vetor.
// Nenhum número do vetor pode ser apagado ou duplicado. Apresente o vetor atualizado na tela
public class Exercicio_14 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] vet = new int[5];

        System.out.println("Insira um numero para a posição " + 1);
            vet[0]=leitor.nextInt();
            int maior = vet[0];

        for(int i = 1; i< 5; i++){

            System.out.println("Insira um numero para a posição " + (i + 1));
            vet[i]=leitor.nextInt();

            if (vet[i]>maior) {
                maior = vet[i];         
            }
        }
        for(int i = 0; i < 5; i++){
            if (vet[i]==maior) {

                vet[i] = vet[5];
                vet[5] = maior;
            }
        }

        leitor.close();
    }
    
}
