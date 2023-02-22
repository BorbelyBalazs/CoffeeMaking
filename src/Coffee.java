public class Coffee {

    CoffeeType type;
    double milk;
    double coffee;
    double cream;
    double water;

    public Coffee(String line) {
        String[] data = line.split(";");
        this.type = CoffeeType.valueOf(data[0]);
        this.milk = Double.parseDouble(data[1]);
        this.coffee = Double.parseDouble(data[2]);
        this.cream = Double.parseDouble(data[3]);
        this.water = Double.parseDouble(data[4]);
    }

    public CoffeeType getType() {
        return type;
    }

    public double getMilk() {
        return milk;
    }

    public double getCoffee() {
        return coffee;
    }

    public double getCream() {
        return cream;
    }

    public double getWater() {
        return water;
    }

    public void setType(CoffeeType type) {
        this.type = type;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }

    public void setCoffee(double coffee) {
        this.coffee = coffee;
    }

    public void setCream(double cream) {
        this.cream = cream;
    }

    public void setWater(double water) {
        this.water = water;
    }

    @Override
    public String toString() {
        return type.getName() + "; " + milk + "; " + coffee + "; " + cream + "; " + water + "\n";
    }
}
