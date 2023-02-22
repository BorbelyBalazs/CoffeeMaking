import java.util.Arrays;

public class Tejszinhab implements MakingCoffee{

    @Override
    public void makingCoffee(Coffee coffee, CoffeeMachine cfm) {
        try {
            tejszinhabKeszites(coffee, cfm);
            tejszinhabHozzaadas();
        } catch (InterruptedException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    private void tejszinhabKeszites(Coffee coffee, CoffeeMachine cfm) throws InterruptedException {
        System.out.println("Tejszínhab készítése folyamatban");
        cfm.setCream(cfm.getCream() - coffee.getCream());
        TimeDelay.timeDelay(4000);
        System.out.println("\nTejszínhab elkészítése kész");

    }

    private void tejszinhabHozzaadas() throws InterruptedException {
        System.out.println("Tejszínhab hozzáadása folyamatban");
        TimeDelay.timeDelay(500);
        System.out.println("\nTejszínhab hozzáadása kész");
    }
}
