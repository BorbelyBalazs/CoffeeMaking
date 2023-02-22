import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class View {

    Scanner s = new Scanner(System.in);
    Controller con = new Controller();
    public void run(List<Coffee> coffees, CoffeeMachine cfm) {
        int choice;

            System.out.println("Üdvözöllek! Milyen kávét szeretnél?\n");
        while (true) {
            System.out.println("1. Espresso\n" +
                    "2. Risoretto\n" +
                    "3. Lungo\n" +
                    "4. Cortado\n" +
                    "5. Americano\n" +
                    "6. Cappuccino\n" +
                    "7. Con Panna\n" +
                    "8. Latte\n" +
                    "9. Szervíz menü");

            choice = s.nextInt();

            switch (choice) {
                case 1 -> con.fozes(coffees.get(0), cfm);
                case 2 -> con.fozes(coffees.get(1), cfm);
                case 3 -> con.fozes(coffees.get(2), cfm);
                case 4 -> con.fozesTejhab(coffees.get(3), cfm);
                case 5 -> con.fozesForroviz(coffees.get(4), cfm);
                case 6 -> con.fozesTejgozolesTejhab(coffees.get(5), cfm);
                case 7 -> con.fozesTejszinhab(coffees.get(6), cfm);
                case 8 -> con.fozesTejgozolesTejhab(coffees.get(7), cfm);
                case 9 -> szervizMenu(cfm);
                default -> System.out.println("Kérlek a megadott opciók közül válassz!");
            }
        }
    }

    private void szervizMenu(CoffeeMachine cfm) {
        System.out.println("Válassz az opciók közül:\n");
        int choice;
        boolean b = true;

        do {
            System.out.println("1. Alapanyagok szintje\n" +
                "2. Alapanyagok feltöltése\n" +
                "3. Vissza a főmenübe\n" +
                "4. Kikapcsolás");

            choice = s.nextInt();


            switch (choice) {
                case 1:
                    con.howManyIngredients(cfm);
                    break;
                case 2:
                    try {
                        reloadIngredientsMenu(cfm);
                    } catch (InterruptedException e) {
                        System.out.println(Arrays.toString(e.getStackTrace()));
                    }
                    break;
                case 3:
                    b = false;
                    break;
                case 4:
                    System.out.println("Viszlát");
                    System.exit(0);
                default:
                    System.out.println("Kérlek a megadott opciók közül válassz!");
            }
        } while (b);
    }

    private void reloadIngredientsMenu(CoffeeMachine cfm) throws InterruptedException {
        System.out.println("Mit szeretnél feltölteni?\n" +
                "1. Kávé\n" +
                "2. Víz\n" +
                "3. Tej\n" +
                "4. Tejszín\n" +
                "5. Mindent\n");

        int choice = s.nextInt();
        boolean b = true;

        while (b) {
            b = false;
            switch (choice) {
                case 1 -> {
                    if (cfm.getCoffee() == cfm.getMaxCoffee()) {
                        System.out.println("A kávé már maximumon van\n");
                    } else {
                        cfm.setCoffee(cfm.getMaxCoffee());
                        System.out.println("A feltöltés folyamatban");
                        TimeDelay.timeDelay(1200);
                        System.out.println("\nA kávé feltöltve\n");
                    }
                }
                case 2 -> {
                    if (cfm.getWater() == cfm.getMaxWater()) {
                        System.out.println("A víz már maximumon van\n");
                    } else {
                        cfm.setWater(cfm.getMaxWater());
                        System.out.println("A feltöltés folyamatban");
                        TimeDelay.timeDelay(800);
                        System.out.println("\nA víz feltöltve\n");
                    }
                }
                case 3 -> {
                    if (cfm.getMilk() == cfm.getMaxMilk()) {
                        System.out.println("A tej már maximumon van\n");
                    } else {
                        cfm.setMilk(cfm.getMaxMilk());
                        System.out.println("A feltöltés folyamatban");
                        TimeDelay.timeDelay(800);
                        System.out.println("\nA tej feltöltve\n");
                    }
                }
                case 4 -> {
                    if (cfm.getCream() == cfm.getMaxCream()) {
                        System.out.println("A tejszín már maximumon van\n");
                    } else {
                        cfm.setCream(cfm.getMaxCream());
                        System.out.println("A feltöltés folyamatban");
                        TimeDelay.timeDelay(1000);
                        System.out.println("\nA tejszín feltöltve\n");
                    }
                }
                case 5 -> {
                    con.reloadIngredients(cfm);
                    System.out.println("A feltöltés folyamatban");
                    TimeDelay.timeDelay(3800);
                    System.out.println("\nAz alapanyagok feltöltve");
                }
                default -> {
                    System.out.println("Kérlek a megadott opciók közül válassz!");
                    b = true;
                }
            }
        }
    }

}
