/*
11. Construa um programa que solicite ao utilizador a sua data
de nascimento e de seguida diga em que dia da semana nasceu.
 */
package Ficha4;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Igor
 */
public class Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira abaixo a sua data de nascimento");
        System.out.print("Dia : ");
        int dia = scanner.nextInt();
        System.out.print("Mes : ");
        int mes = scanner.nextInt();
        System.out.print("Ano : ");
        int ano = scanner.nextInt();
        scanner.close();
        
        GregorianCalendar data = new GregorianCalendar(ano, mes-1, dia);
        
        SimpleDateFormat formatDef = new SimpleDateFormat ("E");
        System.out.println("Nascestes numa " + formatDef.format(data.getTime()) + ".");
// System.out.println("Nasceste numa " + DiasDaSemana.fromPortugues(formatDef.format(data.getTime()).toUpperCase()));
        
    }
}
