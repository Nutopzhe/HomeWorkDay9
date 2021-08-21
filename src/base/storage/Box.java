package base.storage;

import base.shops.ShopBrands;

public class Box {
    private ShopBrands shopBrands;

    public Box(ShopBrands shopBrands) {
        this.shopBrands = shopBrands;
    }

    public ShopBrands getShopBrands() {
        return shopBrands;
    }

    public void setShopBrands(ShopBrands shopBrands) {
        this.shopBrands = shopBrands;
    }

    @Override
    public String toString() {
        return "Box{" +
                "shopBrands=" + shopBrands +
                '}';
    }
}
