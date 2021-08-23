package base.shops;

import base.storage.Box;

import java.util.*;
import java.util.stream.Collectors;

public class Shop {
    private final ShopBrands shopBrands;
    private List<Box> storage = new ArrayList<>();

    public Shop(ShopBrands shopBrands) {
        this.shopBrands = shopBrands;
    }

    //сортировка всех товаров магазина по цене по возрастанию
    public List<Box> sortedStorageByPrice() {
        return storage.stream()
                .sorted((o1, o2) -> (int) (o1.getProduct().getPricePerKg() - o2.getProduct().getPricePerKg()))
                .collect(Collectors.toList());
    }

    //сортировка всех товаром магазина по весу по убыванию
    public List<Box> sortedStorageByWeightDescending() {
        return storage.stream()
                .sorted((o1, o2) -> (o2.getProduct().getWeight() - o1.getProduct().getWeight()))
                .collect(Collectors.toList());
    }

    //подсчет общей стоимости всех товаров (цена товара * вес)
    public int calculatingTheTotalCostOfProducts() {
        return storage.stream().
                mapToInt(p -> (int) (p.getProduct().getPricePerKg() * p.getProduct().getWeight()))
                .sum();
    }

    //подсчет общей стоимости товаров типа "фрукт" среди тех, где цена за кг < 50
    public int calculatingTheTotalCostOfProductsWherePriceLessFifty() {
        return storage.stream()
                .filter(p -> p.getProduct().getProductGrade().getGrade().equalsIgnoreCase("Фрукт"))
                .filter(p -> p.getProduct().getPricePerKg() < 50)
                .mapToInt(p -> (int) (p.getProduct().getPricePerKg() * p.getProduct().getWeight()))
                .sum();
    }

    public HashMap<String, Integer> calculatingTableWhereProductCorrespondsWight() {
        HashMap<String, Integer> map = new HashMap<>();

        for (Box box : storage) {
            //узнаем название и вес продукта, записываем в переменные
            String key = box.getProduct().getProductGrade().name();
            int weight = box.getProduct().getWeight();

            if (map.containsKey(key)) {
                map.put(key, map.get(key) + weight);
            } else
                map.put(box.getProduct().getProductGrade().name(), box.getProduct().getWeight());
        }

        return map;
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
