public class SexCharException extends Exception {
    private int number;

    public SexCharException(String message, int num) {
        super( message );
        number = num;
    }
}
