package base;

public enum Shop {
    CHETVEROCHKA("Четверочка"),
    RAZVILKA("Развилка"),
    ALFAVIT_FKUSA("Алфавит вкуса");
    private final String name;

    Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
