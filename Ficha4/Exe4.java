/*
4. Construa um programa que solicite ao utilizador um dia da
semana e de seguida imprima se é dia de trabalho ou fim-desemana.
 */
package Ficha4;

/**
 *
 * @author Igor Fonseca
 */
import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Indique o dia da semana : ");
        String diaInserido = scanner.nextLine().toLowerCase().trim();
        
        DiasDaSemana dia = DiasDaSemana.fromPortugues(diaInserido);
        
        if (dia == null) {
            System.out.println("Insira um dia válido!");
        } else {
            String tipo = (dia == DiasDaSemana.SABADO || dia == DiasDaSemana.DOMINGO) ? "fim de semana" : "dia de trabalho";
            System.out.println(dia.toPortuguese() + " é "  + tipo + "."); 
        }
    }
}
     