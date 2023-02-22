import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> cof = TextFileReader.getLinesOfTextFile("C:\\Progmatic\\Projectek\\CoffeeMaking\\coffee.txt");
        List<Coffee> coffees = new ArrayList<>();

        for (var i: cof) {
            coffees.add(new Coffee(i));
        }
//        System.out.println(coffees);

        View view = new View();
        CoffeeMachine cfm = new CoffeeMachine();

        view.run(coffees, cfm);

    }
}