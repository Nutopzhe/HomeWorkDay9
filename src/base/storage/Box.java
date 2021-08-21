package base.storage;

import base.products.Products;
import base.shops.ShopBrands;

public class Box {
    private ShopBrands shopBrands;
    private Products product;

    public Box(ShopBrands shopBrands, Products product) {
        this.shopBrands = shopBrands;
        this.product = product;
    }

    public ShopBrands getShopBrands() {
        return shopBrands;
    }

    public void setShopBrands(ShopBrands shopBrands) {
        this.shopBrands = shopBrands;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Коробка->{" +
                "Магазин = " + shopBrands +
                ", " + product +
                '}';
    }
}
