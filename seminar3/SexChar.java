public class SexChar {

    public static int getSexChar(int num) throws SexCharException {
        if (num < 1) {
            throw new SexCharException( "Ошибка: Вы не ввели пол", num );
        } else if (num > 1) {
            throw new SexCharException( "Ошибка: Вы ввели пол, больше, чем один раз", num );
        }
        return 1;
    }

}
