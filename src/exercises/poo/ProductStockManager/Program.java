/*
 * Gerenciador de Estoque de Produtos
 *
 * Descrição:
 * Lê os dados iniciais de um produto, realiza e exibe operações
 * de entrada (adição) e saída (remoção) de itens no estoque utilizando POO.
 */

package exercises.poo.ProductStockManager;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Product product = new Product();

        // 1. Leitura dos dados iniciais
        System.out.println("Enter product data!");
        System.out.print("Name: ");
        product.name = input.nextLine();

        System.out.print("Price: ");
        product.price = input.nextDouble();

        System.out.print("Quantity: ");
        product.quantity = input.nextInt();

        System.out.println("\nProduct data: " + product);

        // 2. Operação de adição
        System.out.print("\nEnter the number of products to be added in stock: ");
        int addedQuantity = input.nextInt();
        product.addProducts(addedQuantity);

        System.out.println("\nUpdated data: " + product);

        // 3. Operação de remoção
        System.out.print("\nEnter the number of products to be removed in stock: ");
        int removedQuantity = input.nextInt();
        product.removeProducts(removedQuantity);

        System.out.println("\nUpdated data: " + product);

        input.close();
    }
}