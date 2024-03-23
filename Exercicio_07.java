import java.util.Scanner;
//Faça um programa que leia dois vetores de 5 elementos cada e 
//verifique se elessão iguais ou não. Para serem iguais, todos os elementos dos dois vetores devem coincidir.


public class Exercicio_07 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int contador = 0;

        for(int i = 0; i < 5;i++){
            System.out.println("Digite  o numero do vetor 1 na posição" + i);
            vetor1[i]=leitor.nextInt();
        }
        for(int i = 0; i < 5;i++){
            System.out.println("Digite  o numero do vetor 2 na posição" + i);
            vetor2[i]=leitor.nextInt();
        }
        for(int i = 0; i<5;i++){
            if(vetor1[i]==vetor2[i]){
                contador++;
            }
        }
        if (contador == 5) {
            System.out.println("Vetores são iguais!!!");
            
        }
        else{
            System.out.println("Os vetores não são iguais :(");
        }

        leitor.close();
    }
    
}
