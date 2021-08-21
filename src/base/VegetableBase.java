package base;

import base.products.ProductGrade;
import base.products.Products;
import base.shops.ShopBrands;
import base.storage.Box;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VegetableBase {
    private List<Box> storage = new ArrayList<>();

    public List<Box> getStorage() {
        return storage;
    }

    //метод наполняемости сладка базы. count - количество коробок
    public void supplyGeneration(int count) {
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            storage.add(new Box(ShopBrands.values()[random.nextInt(ShopBrands.values().length)],
                    new Products(ProductGrade.values()[random.nextInt(ProductGrade.values().length)],
                            random.nextInt(20),
                            random.nextInt(250) + 50)));
        }
    }
}
