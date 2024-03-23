import java.util.Scanner;
//Elabore um programa que leia um vetor com 5 notas de um aluno
// e um outro vetor com 5 pesos e calcule a média ponderada do aluno

public class Exercicio_06 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        double[] nota = new double[5];
        double[] peso = new double[5];
        double mediacima = 0;
        double mediabaixo = 0;

        for(int i = 0; i<5;i++){
            System.out.println("Insira a nota do aluno" + i + ": ");
            nota[i] = leitor.nextDouble();
        }
        for(int i = 0; i<5;i++){
            System.out.println("Insira a peso do aluno" + i + ": ");
            peso[i] = leitor.nextDouble();
        }
        for(int i = 0; i<5;i++){
            mediacima = peso[i] * nota[i];
            
        }
        for(int i = 0; i<5; i++){

            mediabaixo = peso[i];
        }

        System.out.println("A media ponderada é de: " + mediacima/mediabaixo);

        leitor.close();
    }
    
}
