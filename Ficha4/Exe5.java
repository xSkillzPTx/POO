/*
5. Contrua um programa que defina uma enumeração para
representar os meses do ano (Janeiro…Dezembro). Construa uma
aplicação que declare uma enumeração de seguida imprima o seu
nome e o seu número de dias (NOTA: admita que fevereiro tem 28
dias).
 */
package Ficha4;

/**
 *
 * @author Igor
 */

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Indique o ano: ");
        int ano = scanner.nextInt();
        
        System.out.println("Ano " + ano + " :");
        
        for (MesesDoAno mes : MesesDoAno.values()) {
            System.out.println(mes.name() + " tem " + mes.getDias(ano) + " dias.");
        }
    }
    
}
