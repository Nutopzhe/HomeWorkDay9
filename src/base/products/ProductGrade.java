package base.products;

public enum ProductGrade {
    BANANAS("Фрукт"),
    APPLE("Фрукт"),
    POTATO("Овощ"),
    TOMATO("Овощ"),
    CUCUMBER("Овощ"),
    PEAR("Фрукт"),
    ZUCCHINI("Овощ"),
    PEACH("Фрукт");

    private final String grade;

    ProductGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}
