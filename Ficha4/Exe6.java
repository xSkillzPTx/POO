/*
6. Construa um programa que defina um mês e de seguida
imprima o nome do mês seguinte
 */
package Ficha4;

import java.util.Scanner;

/**
 *
 * @author Igor
 */
public class Exe6 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Digite o nome do mês: ");
        String mesInserido = scanner.nextLine().toUpperCase();
        
        try {
            MesesDoAno mesAtual = MesesDoAno.valueOf(mesInserido);
            MesesDoAno proximoMes = mesAtual.proximoMes();
            System.out.println("Estás em " +mesAtual +" e o proximo mês é " + proximoMes +".");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro! Mês inválido");
        }
    }
}
