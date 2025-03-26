/*
7. Construa uma enumeração para guardar os dados dos
planetas do sistema solar, cujos dados são fornecidos pela tabela
seguinte.
  Nome   | Massa (kg)| Raio (m)
MERCURIO | 3.303e+23 | 2.4397e6
VENUS    | 4.869e+24 | 6.0518e6
TERRA    | 5.976e+24 | 6.37814e6
MARTE    | 6.421e+23 | 3.3972e6
JUPITER  | 1.9e+27   | 7.1492e7
SATURNO  | 5.688e+26 | 6.0268e7
URANO    | 1.024e+26 | 2.5559e7
NEPTUNO  | 1.024e+26 | 2.4746e7
A gravidade de um planeta é dada pela fórmula seguinte onde G é
a constante de gravitação universal que vale 6.673E-11
(m³/kg/s²), m é a massa (kg) do planeta e r o seu raio (m),
𝑔 =𝐺𝑚/r^2
Defina uma enumeração com os planetas do sistema solar e um
método para calcular a gravidade do planeta. Construa uma aplicação
que declare um planeta e de seguida imprima o valor da sua gravidade.
 */
package Ficha4;

import java.util.Scanner;

/**
 *
 * @author Igor
 */
public class Exe7 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insira o planeta: ");
        String planetaInserido = scanner.nextLine().toUpperCase();
        
        try {
            Planetas planeta = Planetas.valueOf(planetaInserido);
            double gravidade = planeta.calcularGravidade();
            System.out.printf("A gravidade em %s é de %.2f m/s².%n", planeta.name(), gravidade);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro! Planeta inválido");
        }
    }
}
