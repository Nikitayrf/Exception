public class DataException extends Exception {
    private int number;

    public DataException(String message, int num) {
        super( message );
        number = num;
    }
}
