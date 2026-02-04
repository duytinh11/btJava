package bt3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Product> products = new ArrayList<>();
        products.add(new ElectronicProduct("EP1","Tủ lạnh Hitachi",50000000.0,24));
        products.add(new ClothingProduct("CP1","Áo thời trang B",250000.0,"M"));
        products.add(new FoodProduct("FP1","Táo Envy",100000.0,5));
        for (Product p: products){
            System.out.println(p.getInfo());
        }
    }
}
