import java.util.Scanner;

//Faça um programa que leia em um vetor uma sequência finita de números digitadospelo usuário. 
//Crie um segundo vetor que armazene o dobro de cada número doprimeiro vetor e depois apresente os
// valores deste vetor


public class Exercicio_03 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de números que deseja inserir: ");
        int quantidade = leitor.nextInt();

        int[] num = new int [quantidade];
        int[] numdobro = new int[quantidade];

        for(int i = 0; i < quantidade; i++){
            System.out.println("Digite o numero na posição " + i + ": ");
            num[i] = leitor.nextInt();
            numdobro [i]= num[i] * 2;

        }
        for(int i = 0; i < quantidade; i++){
            System.out.println("\n posiçao  " + i + "numero:" + numdobro[i]);
        }

        leitor.close();
        
    }
}
