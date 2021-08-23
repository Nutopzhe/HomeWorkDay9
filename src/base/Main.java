package base;

import base.shops.Shop;

public class Main {
    public static void main(String[] args) {
        VegetableBase vegetableBase = new VegetableBase();
        //генерируем коробки к себе на базу
        vegetableBase.generationSupply(20);
        //генерируем магазины к себе в базу магазинов
        vegetableBase.generationShops();


//        System.out.println(vegetableBase.getStorage());
//        System.out.println("-------------------------------");
//        System.out.println(vegetableBase.getStorage().size());
//        System.out.println(vegetableBase.getStoreBase());
//        System.out.println("\n=================================\n");

        vegetableBase.transporterBoxToShop();

//        System.out.println(vegetableBase.getStorage());
//        System.out.println("-------------------------------");

        Shop shop = vegetableBase.getStoreBase().get(1);

        System.out.println(shop.sortedStorageByPrice());
        System.out.println("\n------------------------------------\n");
        System.out.println(shop.sortedStorageByWeightDescending());
        System.out.println("\n------------------------------------\n");
//        System.out.println(shop.calculatingTheTotalCostOfProducts());
//        System.out.println(shop.calculatingTheTotalCostOfProductsWherePriceLessFifty());

        System.out.println(shop.calculatingTableWhereProductCorrespondsWight());


    }
}
