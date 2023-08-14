public class FioNumberException extends Exception {
    private int number;

    public FioNumberException(String message, int num) {
        super( message );
        number = num;
    }
}
