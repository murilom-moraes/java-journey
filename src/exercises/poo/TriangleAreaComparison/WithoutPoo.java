/*
 * Comparação de Áreas de Triângulos (Sem POO - Procedural)
 *
 * Descrição:
 * Lê as medidas dos lados de dois triângulos usando variáveis isoladas
 * e realiza o cálculo da área manualmente no método main.
 */

package exercises.poo.TriangleAreaComparison;

import java.util.Locale;
import java.util.Scanner;

public class WithoutPoo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        // Variável auxiliar para o cálculo do semiperímetro (p)
        double p;

        // Leitura das medidas do Triângulo X
        System.out.println("Enter the measures of triangle X:");
        double xA = input.nextDouble();
        double xB = input.nextDouble();
        double xC = input.nextDouble();

        // Leitura das medidas do Triângulo Y
        System.out.println("Enter the measures of triangle Y:");
        double yA = input.nextDouble();
        double yB = input.nextDouble();
        double yC = input.nextDouble();

        // Cálculo manual da área do Triângulo X (Fórmula de Heron)
        p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        // Cálculo manual da área do Triângulo Y (Fórmula de Heron)
        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        // Exibição dos resultados formatados
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        // Verificação de qual triângulo possui a maior área
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        input.close();
    }
}