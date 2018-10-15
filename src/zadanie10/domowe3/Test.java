package zadanie10.domowe3;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        List<Product> products = new ArrayList<>();

        createList.create(products);

        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("");
        System.out.printf("Suma cen produktów: %.2f",sumPrices(products));
        System.out.println("");
        Product MostExpensive = Collections.max(products, new compPrice());
        System.out.println("Najdroższy produkt:\n"+MostExpensive);



    }

    private static double sumPrices(List<Product>products) {
        double sum = 0;
        for (Product product : products) {
            sum+=product.getPrice();
        }
        return sum;
    }

}
