import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Kavefozes implements MakingCoffee {


    @Override
    public void makingCoffee(Coffee coffee, CoffeeMachine cfm) {
        try {
            orles(coffee, cfm);
            surites();
            lefozes(coffee, cfm);
            zaccUrites();
        } catch (InterruptedException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    void orles(Coffee coffee, CoffeeMachine cfm) throws InterruptedException {
        System.out.println("Kávé őrlése folyamatban");
        cfm.setCoffee(cfm.getCoffee() - coffee.getCoffee());
        TimeDelay.timeDelay(1500);
        System.out.println("\nKávé őrlése kész");
    }

    void surites() throws InterruptedException {
        System.out.println("Sűrítés folyamatban");
        TimeDelay.timeDelay(500);
        System.out.println("\nSűrítés kész");
    }

    void lefozes(Coffee coffee, CoffeeMachine cfm) throws InterruptedException {
        System.out.println("Vízzel lefőzés folyamatban");
        cfm.setWater(cfm.getWater() - coffee.getWater());
        TimeDelay.timeDelay(1000);
        System.out.println("\nVízzel lefőzés kész");
    }

    void zaccUrites() throws InterruptedException {
        System.out.println("Zacc kiürítése folyamatban");
        TimeDelay.timeDelay(700);
        System.out.println("\nZacc kiürítése kész");
    }
}
