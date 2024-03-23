import java.util.Scanner;
//Elabore um algoritmo que leia 5 números do teclado e preencha um vetor de acordo com a seguinte regra:
// com exceção do 1º número, só é permitido armazenarum número se ele for maior que o anterior. 
//Ex.: se o primeiro valor lido for 5, o próximovalor lido só poderá ser maior que 5
public class Exercicio_15 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] vet = new int[5];
        
        System.out.println("Insira um numero para a posição " + 1);
            vet[0]=leitor.nextInt();

        for(int i = 1; i < 5;){

            System.out.println("Insira um numero para a posição " + (i + 1) + " maior que " + vet[i - 1]);
            int maior = leitor.nextInt();
            if (maior > vet[i - 1]) {
                vet[i]= maior;
                i++;
            }
        }
        System.out.println("O vetor é: ");
        for(int i = 0; i < 5; i++){
            System.out.println(" " + vet[i]);
        }
        leitor.close();
    }
    
}
