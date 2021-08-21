package base.shops;

public enum ShopBrands {
    CHETVEROCHKA("Четверочка", 44),
    RAZVILKA("Развилка", 7),
    ALFAVIT_FKUSA("Алфавит вкуса", 33);

    private final String name;
    private final int id;

    ShopBrands(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return '\'' + name + '\'' +
                ", id=" + id +
                '}';
    }
}
