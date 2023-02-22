import java.util.Arrays;

public class TejGozoles implements MakingCoffee{
    @Override
    public void makingCoffee(Coffee coffee, CoffeeMachine cfm) {
        if (coffee.getType().equals(CoffeeType.latte)) {
            coffee.setMilk(9);
        } else if (coffee.getType().equals(CoffeeType.conPanna)) {
            coffee.setMilk(2);
        }
        try {
            tejGozolese(coffee, cfm);
            gozoltTejHozzaadasa();
        } catch (InterruptedException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    private void tejGozolese(Coffee coffee, CoffeeMachine cfm) throws InterruptedException {
        System.out.println("Tej gőzölése folyamatban");
        cfm.setMilk(cfm.getMilk() - coffee.getMilk());
        TimeDelay.timeDelay(3000);
        System.out.println("\nTej gőzölése kész");
    }

    private void gozoltTejHozzaadasa() throws InterruptedException {
        System.out.println("A gőzölt tej hozzáadása folyamatban");
        TimeDelay.timeDelay(300);
        System.out.println("\nA gőzölt tej hozzáadása kész");
    }
}
