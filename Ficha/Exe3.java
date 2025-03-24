/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
