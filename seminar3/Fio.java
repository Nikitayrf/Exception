public class Fio {
    public static int getFioNumber(int num) throws FioNumberException {
        if (num < 3) {
            throw new FioNumberException( "Ошибка: Вы не ввели все данные ФИО", num );
        } else if (num > 3) {
            throw new FioNumberException( "Ошибка: Вы ввели больше данных ФИО, укажите только Фамилия, Имя, Отчество", num );
        }
        return 1;
    }
}
