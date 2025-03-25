/*
 1. Contrua um programa que defina uma enumeração para
representar os dias da semana (Segunda…Domingo). Construa uma
aplicação que declare uma enumeração com dia de terça e de
seguida imprima o seu nome em português.
 */
package Ficha4;

/**
 *
 * @author Igor Fonseca
 */
public class Exe1 {
    public static void main(String[] args) {
        DiasDaSemana d = DiasDaSemana.TERCA;
        DiasDaSemana e = DiasDaSemana.DOMINGO;
        
        System.out.println(d.toPortuguese());
        System.out.println(e.toPortuguese());
    }
    
}
