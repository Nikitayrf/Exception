public class PhoneNumber {

    public static int getPhoneNumber(int num) throws PhoneNumberException {
        if (num < 1) {
            throw new PhoneNumberException( "Ошибка: Вы не ввели номер телефона", num );
        } else if (num > 1) {
            throw new PhoneNumberException( "Ошибка: Вы ввели, больше, чем один номер телефона", num );

        }
        return 1;
    }
}
