package zadanie10.domowe3;

import java.io.*;
import java.util.List;

public class createList {
    public static void create(List<Product> products) throws IOException {
        File file = new File("produkty.csv");
        BufferedReader bfr = new BufferedReader(new FileReader(file));
        String line ="";
        while((line=bfr.readLine())!=null){
            String[]values = line.split(";");
            if(values.length==3){
                String name = values[0];
                String producent = values[1];
                String priceAsString = values[2];

                double  price = Double.parseDouble(priceAsString);
                Product p = new Product(name,producent,price);

                products.add(p);
            }
        }

    }
}
