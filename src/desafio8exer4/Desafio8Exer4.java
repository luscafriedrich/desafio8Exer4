package desafio8exer4;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Desafio8Exer4 {
    public static void main(String[] args) {
        int n;
        Scanner ler = new Scanner(System.in);   
        
        System.out.println("Digite um valor: ");
        n = ler.nextInt();
        
        if(n>=10 && n<=20){
            System.out.println("Este numero está dentro do intervalo de tempo");
        }else{
            System.out.println("O numero está fora do intervalo de tempo");
        }
    }
}
