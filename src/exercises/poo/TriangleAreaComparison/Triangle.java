/*
 * Representação da Entidade Triângulo
 *
 * Descrição:
 * Modela um triângulo com três lados (a, b, c) e encapsula o cálculo 
 * da sua área através da Fórmula de Heron no método area().
 */

package exercises.poo.TriangleAreaComparison;

public class Triangle {

    // Atributos: medidas dos lados do triângulo
    public double a;
    public double b;
    public double c;

    // Método: calcula e retorna a área do triângulo usando a fórmula de Heron
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}