public class Data {
    public static int getNumberData(int num) throws DataException {
        if (num == -1) {
            throw new DataException( "Вы ввели меньше данных, чем требуется", num );
        } else if (num == -2) {
            throw new DataException( "Вы ввели больше данных, чем требуется", num );
        }
        return 1;
    }
}
