public class Controller {
    Forroviz forroviz = new Forroviz();
    Tejhab tejhab = new Tejhab();
    TejGozoles tejgozoles = new TejGozoles();
    Kavefozes kavefozes = new Kavefozes();
    Tejszinhab tejszinhab = new Tejszinhab();

    public void fozes(Coffee coffee, CoffeeMachine cfm) {
        try {
            exceptionCheck(coffee, cfm);
            kavefozes.makingCoffee(coffee, cfm);
            System.out.println("\nKész a(z) " + coffee.getType().getName() + "\n");
            ingredientsCheck(cfm);
            System.out.println("Kérsz még egy kávét?");
        } catch (RunOutOfIngredientsException e) {
            e.runOutMessage();
        }
    }

    public void fozesTejhab(Coffee coffee, CoffeeMachine cfm) {
        try {
            exceptionCheck(coffee, cfm);
            kavefozes.makingCoffee(coffee, cfm);
            tejhab.makingCoffee(coffee, cfm);
            System.out.println("\nKész a(z) " + coffee.getType().getName() + "\n");
            ingredientsCheck(cfm);
            System.out.println("Kérsz még egy kávét?");
        } catch (RunOutOfIngredientsException e) {
            e.runOutMessage();
        }
    }


    public void fozesForroviz(Coffee coffee, CoffeeMachine cfm) {
        try {
            exceptionCheck(coffee, cfm);
            kavefozes.makingCoffee(coffee, cfm);
            forroviz.makingCoffee(coffee, cfm);
            System.out.println("\nKész a(z) " + coffee.getType().getName() + "\n");
            ingredientsCheck(cfm);
            System.out.println("Kérsz még egy kávét?");
        } catch (RunOutOfIngredientsException e) {
            e.runOutMessage();
        }

    }

    public void fozesTejgozolesTejhab(Coffee coffee, CoffeeMachine cfm) {
        try {
            exceptionCheck(coffee, cfm);
            kavefozes.makingCoffee(coffee, cfm);
            tejgozoles.makingCoffee(coffee, cfm);
            tejhab.makingCoffee(coffee, cfm);
            System.out.println("\nKész a(z) " + coffee.getType().getName() + "\n");
            ingredientsCheck(cfm);
            System.out.println("Kérsz még egy kávét?");
        } catch (RunOutOfIngredientsException e) {
            e.runOutMessage();
        }
    }

    public void fozesTejszinhab(Coffee coffee, CoffeeMachine cfm) {
        try {
            exceptionCheck(coffee, cfm);
            kavefozes.makingCoffee(coffee, cfm);
            tejszinhab.makingCoffee(coffee, cfm);
            System.out.println("\nKész a(z) " + coffee.getType().getName() + "\n");
            ingredientsCheck(cfm);
            System.out.println("Kérsz még egy kávét?");
        } catch (RunOutOfIngredientsException e) {
            e.runOutMessage();
        }
    }


    public void howManyIngredients(CoffeeMachine cfm) {
        System.out.println("A gépben jelenleg ennyi alapanyag van:\n" +
                "Kávé: " + cfm.getCoffee() + "\n" +
                "Víz: " + cfm.getWater() + "\n" +
                "Tej: " + cfm.getMilk() + "\n" +
                "Tejszín: " + cfm.getCream() + "\n");
    }

    public void reloadIngredients(CoffeeMachine cfm) {
        cfm.setCoffee(cfm.getMaxCoffee());
        cfm.setMilk(cfm.getMaxMilk());
        cfm.setWater(cfm.getMaxWater());
        cfm.setCream(cfm.getMaxCream());
    }

    public void ingredientsCheck(CoffeeMachine cfm) {
        if (cfm.getCoffee() < cfm.getMaxCoffee() * 0.05) {
            System.out.println("Figyelem, a gépben kevesebb mint 5% kávé maradt\n");
        } else if (cfm.getCoffee() < cfm.getMaxCoffee() * 0.1) {
            System.out.println("Figyelem, a gépben kevesebb mint 10% kávé maradt\n");
        } else if (cfm.getCoffee() < cfm.getMaxCoffee() * 0.2) {
            System.out.println("Figyelem, a gépben kevesebb mint 20% kávé maradt\n");
        }

        if (cfm.getWater() < cfm.getMaxWater() * 0.05) {
            System.out.println("Figyelem, a gépben kevesebb mint 5% víz maradt\n");
        } else if (cfm.getWater() < cfm.getMaxWater() * 0.1) {
            System.out.println("Figyelem, a gépben kevesebb mint 10% víz maradt\n");
        } else if (cfm.getWater() < cfm.getMaxWater() * 0.2) {
            System.out.println("Figyelem, a gépben kevesebb mint 20% víz maradt\n");
        }

        if (cfm.getMilk() < cfm.getMaxMilk() * 0.05) {
            System.out.println("Figyelem, a gépben kevesebb mint 5% tej maradt\n");
        } else if (cfm.getMilk() < cfm.getMaxMilk() * 0.1) {
            System.out.println("Figyelem, a gépben kevesebb mint 10% tej maradt\n");
        } else if (cfm.getMilk() < cfm.getMaxMilk() * 0.2) {
            System.out.println("Figyelem, a gépben kevesebb mint 20% tej maradt\n");
        }

        if (cfm.getCream() < cfm.getMaxCream() * 0.05) {
            System.out.println("Figyelem, a gépben kevesebb mint 5% tejszín maradt\n");
        } else if (cfm.getCream() < cfm.getMaxCream() * 0.1) {
            System.out.println("Figyelem, a gépben kevesebb mint 10% tejszín maradt\n");
        } else if (cfm.getCream() < cfm.getMaxCream() * 0.2) {
            System.out.println("Figyelem, a gépben kevesebb mint 20% tejszín maradt\n");
        }
    }

    public void exceptionCheck(Coffee coffee, CoffeeMachine cfm) throws RunOutOfIngredientsException {
        if (cfm.getCoffee() < coffee.getCoffee()) {
            throw new RunOutOfIngredientsException("kávé");
        } else if (cfm.getWater() < coffee.getWater()) {
            throw new RunOutOfIngredientsException("víz");
        } else if (cfm.getMilk() < coffee.getMilk()) {
            throw new RunOutOfIngredientsException("tej");
        } else if (cfm.getCream() < coffee.getCream()) {
            throw new RunOutOfIngredientsException("tejszín");
        }
    }
}
