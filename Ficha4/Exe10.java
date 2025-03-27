/*
10. Construa um programa que solicite ao utilizador a sua data
de nascimento e de seguida o quantos anos tem. 
Extra : Fiz uma verificação para felicitar o aniversário ao user, caso a data de nascimento do user for igual ao dia atual
*/
package Ficha4;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Igor
 */
public class Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira a sua data de nascimento");
        System.out.print("Dia : ");
        int dia = scanner.nextInt();
        System.out.print("Mes : ");
        int mes = scanner.nextInt();
        System.out.print("Ano : ");
        int ano = scanner.nextInt();
        scanner.close();
        
        GregorianCalendar data = new GregorianCalendar(ano, mes-1, dia);
        
        GregorianCalendar dataAtual = new GregorianCalendar();
        
        int anos = dataAtual.get(GregorianCalendar.YEAR) - data.get(GregorianCalendar.YEAR); 
        int diaAnoAtual = dataAtual.get(GregorianCalendar.DAY_OF_YEAR);
        int diaAnoNascimento =data.get(GregorianCalendar.DAY_OF_YEAR);
        if (diaAnoAtual < diaAnoNascimento) {
            anos--;
        }
        System.out.println("Tens " +anos +" anos.");
        if (diaAnoAtual == diaAnoNascimento) {
            System.out.println("Hoje é o teu aniversário! Parabéns!!!");
        }
    }
}
