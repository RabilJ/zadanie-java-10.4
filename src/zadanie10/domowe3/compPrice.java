package zadanie10.domowe3;

import java.util.Comparator;

public class compPrice implements Comparator<Product>{
    public int compare(Product a, Product b){
        if(a.getPrice()>b.getPrice())
            return 1;
        if(a.getPrice()==b.getPrice())
            return 0;
        return -1;
    }

}
