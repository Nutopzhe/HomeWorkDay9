package base;

public class Main {
    public static void main(String[] args) {
        VegetableBase vegetableBase = new VegetableBase();
        //генерируем коробки к себе на базу
        vegetableBase.generationSupply(100);
        //генерируем магазины себе в базу магазинов
        vegetableBase.generationShops();


        System.out.println(vegetableBase.getStorage());
        System.out.println("-------------------------------");
        System.out.println(vegetableBase.getStorage().size());
        System.out.println(vegetableBase.getStoreBase());
        System.out.println("\n=================================\n");
        vegetableBase.transporterBoxToShop();
        System.out.println(vegetableBase.getStorage());
        System.out.println("-------------------------------");

//        System.out.println(vegetableBase.getStoreBase().get(1).getStorage().size());
//        System.out.println(vegetableBase.getStoreBase().get(2).getStorage().size());
//        System.out.println(vegetableBase.getStoreBase().get(3).getStorage().size());



    }
}
