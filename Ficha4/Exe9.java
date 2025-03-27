/*
9. Construa um programa que solicite ao utilizador a sua data de
nascimento e de seguida a imprima por extenso em Francês e em
Inglês.
 */
package Ficha4;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Igor
 */
public class Exe9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Insira a sua data de nascimento");
        System.out.print("Dia: ");
        int dia = scanner.nextInt();
        System.out.print("Mes: ");
        int mes = scanner.nextInt();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        
        try {
            GregorianCalendar data = new GregorianCalendar(ano, mes-1, dia);
            data.setLenient(false);
            data.getTime();
            
            SimpleDateFormat formatUK = new SimpleDateFormat ("EEEE ',' dd 'of' MMMM YYY", Locale.UK);
            SimpleDateFormat formatFR = new SimpleDateFormat("EEEE ',' dd'/'MMMM'/'YYYY", Locale.FRANCE);
            
            System.out.println("Data de nascimento em Inglês: "+ formatUK.format(data.getTime()));
            System.out.println("Data de nascimento em Francês: "+ formatFR.format(data.getTime()));
        } catch (Exception e) {
            System.out.println("Data incorreta");
        }
    }
}
