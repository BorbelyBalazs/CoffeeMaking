public enum CoffeeType {
    espresso("Espresso"),
    ristretto("Ristretto"),
    lungo("Lungo"),
    cortado("Cortado"),
    americano("Americano"),
    cappuccino("Cappuccino"),
    conPanna("Con Panna"),
    latte("Latte");

    final String name;

    CoffeeType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
