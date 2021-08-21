package base.shops;

import base.storage.Box;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final ShopBrands shopBrands;
    private List<Box> storage = new ArrayList<>();

    public Shop(ShopBrands shopBrands) {
        this.shopBrands = shopBrands;
    }

    public ShopBrands getShopBrands() {
        return shopBrands;
    }

    public List<Box> getStorage() {
        return storage;
    }

    public void setStorage(List<Box> storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopBrands=" + shopBrands +
                '}';
    }
}
