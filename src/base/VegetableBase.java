package base;

import base.products.ProductGrade;
import base.products.Products;
import base.shops.Shop;
import base.shops.ShopBrands;
import base.storage.Box;

import java.util.*;

public class VegetableBase {
    private List<Box> storage = new ArrayList<>();
    private HashMap<Integer, Shop> storeBase = new HashMap<>();

    //метод наполняемости сладка базы. count - количество коробок
    public void generationSupply(int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            storage.add(new Box(ShopBrands.values()[random.nextInt(ShopBrands.values().length)],
                    new Products(ProductGrade.values()[random.nextInt(ProductGrade.values().length)],
                            random.nextInt(20),
                            random.nextInt(250) + 50)));
        }
    }

    //метод генерации магазинов, в зависимости от длины списка магазинов в enum ShopBrands
    //все сгенерированные магазины помешаются в нашу базу магазинов HashMap storeBase
    public void generationShops() {
        for (int i = 0; i < ShopBrands.values().length; i++) {
            storeBase.put(i + 1, new Shop(ShopBrands.values()[i]));
        }
    }

    //метод транспортировки коробок из storage базы в -> storage магазинов,
    //которые лежат у нас в нашей базе HashMap storeBase
    public void transporterBoxToShop() {
        for (Map.Entry<Integer, Shop> entry : storeBase.entrySet()) {
            for (int i = 0; i < storage.size(); i++) {
                if (entry.getValue().getShopBrands().getName().equals(storage.get(i).getShopBrands().getName())) {
                    entry.getValue().getStorage().add(storage.get(i));
                    storage.remove(storage.get(i));
                    i -= 1;
                }
            }
        }
    }

    public List<Box> getStorage() {
        return storage;
    }

    public HashMap<Integer, Shop> getStoreBase() {
        return storeBase;
    }

    public void setStoreBase(HashMap<Integer, Shop> storeBase) {
        this.storeBase = storeBase;
    }
}
