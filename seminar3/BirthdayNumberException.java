public class BirthdayNumberException extends Exception {
    private int number;

    public BirthdayNumberException(String message, int num) {
        super( message );
        number = num;
    }
}
