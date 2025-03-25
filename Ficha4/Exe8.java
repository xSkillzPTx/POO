/*
 8. Construa um programa que solicite ao utilizador a sua data de
nascimento e de seguida a imprima por extenso.
 */
package Ficha4;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Igor Fonseca
 */
public class Exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira abaixo a sua data de nascimento");
        System.out.print("Dia : ");
        int dia = scanner.nextInt();
        System.out.print("Mês : ");
        int mes = scanner.nextInt();
        System.out.print("Ano : ");
        int ano = scanner.nextInt();
        
        GregorianCalendar data = new GregorianCalendar(ano, mes-1, dia);
        data.setLenient(false);
        
        try {
            data.getTime();
            
            SimpleDateFormat formatDef = new SimpleDateFormat("EEEE, 'dia' d 'de' MMMM 'de' yyyy.");
            
            System.out.println("Nasceste numa, " + formatDef.format(data.getTime()));
        } catch (Exception e) {
            System.out.println("Data errada!");
        }
    }
}
