/*
 * Comparação de Áreas de Triângulos (Com POO)
 *
 * Descrição:
 * Lê as medidas dos lados de dois triângulos (X e Y) e utiliza a classe Triangle
 * para instanciar os objetos e calcular suas áreas de forma delegada.
 */

package exercises.poo.TriangleAreaComparison;

import java.util.Locale;
import java.util.Scanner;

public class WithPoo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        // Instanciação dos objetos triângulo X e Y
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        // Leitura das medidas do Triângulo X
        System.out.println("Enter the measures of triangle X:");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();

        // Leitura das medidas do Triângulo Y
        System.out.println("Enter the measures of triangle Y:");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();

        // Invocação do método area() diretamente dos objetos
        double areaX = x.area();
        double areaY = y.area();

        // Exibição dos resultados formatados
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        // Estrutura condicional para determinar a maior área
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        input.close();
    }
}