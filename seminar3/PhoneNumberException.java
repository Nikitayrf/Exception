public class PhoneNumberException extends Exception {

    private int number;

    public PhoneNumberException(String message, int num) {
        super( message );
        number = num;
    }
}
