package zadanie10.domowe3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        Product[] products = new Product[3];

        File file = new File("produkty.csv");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

        private static double sumPrices(Product[]products){
            int sum = 0;
            for (int i = 0; i < products.length; i++) {
                sum+=products[i].getPrice();
            }
            return sum;
            }

    }
