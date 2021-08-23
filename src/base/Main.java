package base;

import base.shops.Shop;

public class Main {
    public static void main(String[] args) {
        //создаем овощную базу
        VegetableBase vegetableBase = new VegetableBase();
        //генерируем магазины к себе в базу магазинов
        vegetableBase.generationShops();
        //генерируем коробки к себе на базу с указанием их количества
        vegetableBase.generationSupply(20);

        //вывод в консоль всех коробок с нашей базы и их количество
        System.out.println(vegetableBase.getStorage());
        System.out.println("-------------------------------");
        System.out.println("Количество коробок на нашей базе: " + vegetableBase.getStorage().size());
        System.out.println("-------------------------------\n");

//        System.out.println("\n=================================\n");
        //транспортируем коробки с нашей базы в сети магазинов из нашей базы магазинов
        vegetableBase.transporterBoxToShop();

        //берем любой магазин из нашей базы
        //и проверяем правильность транспортировки коробок с продуктами
        Shop shop = vegetableBase.getStoreBase().get(1);
        System.out.println("Проверка коробок в магазине\n-------------------------------");
        System.out.println(shop.getStorage() + "\n");

        //проверка всех методов сортировок товара в магазине
        System.out.println("Сортировка товаров по возрастанию цены за кг\n-------------------------------");
        System.out.println(shop.sortedStorageByPrice() + "\n");

        System.out.println("Сортировка товаров по массе по убыванию\n-------------------------------");
        System.out.println(shop.sortedStorageByWeightDescending() + "\n");

        System.out.println("Подсчет общей стоимости запасов в магазине\n-------------------------------");
        System.out.println(shop.calculatingTheTotalCostOfProducts() + "\n");

        System.out.println("Подсчет общей стоимости запасов фруктов, с ценой менее 50 рублей\n-------------------------------");
        System.out.println(shop.calculatingTheTotalCostOfProductsWherePriceLessFifty() + "\n");

        System.out.println("Расчет таблицы, где каждому продукту соответствует его суммарный вес\n-------------------------------");
        System.out.println(shop.calculatingTableWhereProductCorrespondsWight() + "\n");
    }
}
