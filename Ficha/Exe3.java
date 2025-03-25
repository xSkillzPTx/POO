/*
3. Construa um programa que que solicite o nome de um dia em
português e de seguida imprima o nome em inglês utilizando a
enumeração.
 */
package Ficha;

/**
 *
 * @author Igor Fonseca
 */
import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza o dia da semana em Portugues: ");
        String txt = scanner.nextLine();
        DiasDaSemana d1 = DiasDaSemana.fromPortugues(txt);
        System.out.print("Dia da semana em Inglês : " +d1.toEnglish());
        
    }
}
