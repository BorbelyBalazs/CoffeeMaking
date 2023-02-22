import java.util.Arrays;

public class Forroviz implements MakingCoffee{
    @Override
    public void makingCoffee(Coffee coffee, CoffeeMachine cfm) {
        try {
            forrovizKeszitese(coffee, cfm);
            forrovizHozzaadasa();
        } catch (InterruptedException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    private void forrovizKeszitese(Coffee coffee, CoffeeMachine cfm) throws InterruptedException {
        System.out.println("Forró víz készítése folyamatban");
        TimeDelay.timeDelay(4000);
        System.out.println("\nForró víz készítése kész");
    }


    private void forrovizHozzaadasa() throws InterruptedException {
        System.out.println("Forró víz hozzáadása folyamatban");
        TimeDelay.timeDelay(400);
        System.out.println("\nForró víz hozzáadása kész");
    }
}
