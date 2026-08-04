/*
 * Representação da Entidade Produto
 *
 * Descrição:
 * Modela um produto contendo nome, preço e quantidade em estoque. 
 * Encapsula operações de entrada e saída de estoque, além do cálculo 
 * do valor total armazenado.
 */

package exercises.poo.ProductStockManager;

public class Product {

    // Atributos: dados do produto
    public String name;
    public double price;
    public int quantity;

    // Método: calcula e retorna o valor total do produto em estoque
    public double totalValueInStock() {
        return price * quantity;
    }

    // Método: adiciona uma quantidade especificada ao estoque atual
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    // Método: remove uma quantidade especificada do estoque atual
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    // Método: formata os dados do produto para exibição em texto
    @Override
    public String toString() {
        return String.format("%s, $%.2f, %d units, Total $%.2f",
                name, price, quantity, totalValueInStock());
    }

}