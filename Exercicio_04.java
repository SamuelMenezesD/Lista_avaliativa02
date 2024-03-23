import java.util.Scanner;

//Elabore um programa que leia um vetor de 5 números digitados pelo usuário e uma variável de um número n qualquer, 
//depois mostre na tela o índice dos elementos que são inferiores a n

public class Exercicio_04 {
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

        System.out.println("Os numeros inferiores a " + n +"são: ");

        for(int i = 0; i < 5;i++){
            if(num[i] < n){
                System.out.println("\n" + i);
            }
        }


        leitor.close();
    }
}
