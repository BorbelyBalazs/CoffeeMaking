public class RunOutOfIngredientsException extends Exception {

    public void runOutMessage() {
        System.out.printf("Nincs elég %s a gépben. Kérlek előbb töltsd fel a gépet!\n", getMessage());
    }

    public RunOutOfIngredientsException(String message) {
        super(message);
    }
}
