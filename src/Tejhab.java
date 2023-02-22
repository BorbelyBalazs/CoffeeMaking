import java.util.Arrays;

public class Tejhab implements MakingCoffee {

    @Override
    public void makingCoffee(Coffee coffee, CoffeeMachine cfm) {

        if (coffee.getType().equals(CoffeeType.latte)) {
            coffee.setMilk(1);
        } else if (coffee.getType().equals(CoffeeType.conPanna)) {
            coffee.setMilk(2);
        }
        try {
            tejhabKeszites(coffee, cfm);
            tejhabHozzaadas();
        } catch (InterruptedException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    private void tejhabHozzaadas() throws InterruptedException {
        System.out.println("Tejhab hozzáadása folyamatban");
        TimeDelay.timeDelay(400);
        System.out.println("\nTejhab hozzáadása kész");
    }

    private void tejhabKeszites(Coffee coffee, CoffeeMachine cfm) throws InterruptedException {
        System.out.println("Tejhab elkészítése folyamatban");
        cfm.setMilk(cfm.getMilk() - coffee.getMilk());
        TimeDelay.timeDelay(3500);
        System.out.println("\nTejhab elkészítése kész");
    }
}
