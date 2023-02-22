public class CoffeeMachine {

    private double water = 10;
    private final double maxWater = 30;
    private double coffee = 40;
    private final double maxCoffee = 40;
    private double milk = 10;
    private final double maxMilk = 25;
    private double cream = 3;
    private final double maxCream = 10;

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getMaxWater() {
        return maxWater;
    }

    public double getCoffee() {
        return coffee;
    }

    public void setCoffee(double coffee) {
        this.coffee = coffee;
    }

    public double getMaxCoffee() {
        return maxCoffee;
    }

    public double getMilk() {
        return milk;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }

    public double getMaxMilk() {
        return maxMilk;
    }

    public double getCream() {
        return cream;
    }

    public void setCream(double cream) {
        this.cream = cream;
    }

    public double getMaxCream() {
        return maxCream;
    }
}
