package base.shops;

public class Shop {
    private final ShopBrands shopBrands;

    public Shop(ShopBrands shopBrands) {
        this.shopBrands = shopBrands;
    }

    public ShopBrands getShopBrands() {
        return shopBrands;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopBrands=" + shopBrands +
                '}';
    }
}
