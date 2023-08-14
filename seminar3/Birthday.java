public class Birthday {
    public static int getBirthdayNumber(int num) throws BirthdayNumberException {

        if (num < 1) {
            throw new BirthdayNumberException( "Ошибка: Вы не ввели дату рождения", num );
        } else if (num > 1) {
            throw new BirthdayNumberException( "Ошибка: Вы ввели дату рождения, больше, чем один раз", num );
        }
        return 1;
    }
}
