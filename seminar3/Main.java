import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) )) {
            System.out.println( "Введите данные: Фамилия Имя Отчество дата рождения номер телефона пол" );
            System.out.println( "Пример: Иванов Петр Александрович 14.05.1987 79370757272 m" );
            System.out.print( "Вводите : " );

            String input = br.readLine();
            String[] words = input.split( " " );

            try {
                Data.getNumberData( findData( words ) );
                PhoneNumber.getPhoneNumber( findNumber( words ) );
                SexChar.getSexChar( findChar( words ) );
                Birthday.getBirthdayNumber( findBirthday( words ) );
                Fio.getFioNumber( findFio( words ) );
                try (FileWriter writer = new FileWriter( words[0] + ".txt", true )) {
                    writer.write( input + "\n" );
                } catch (IOException e) {
                    System.out.println( e.getMessage() );
                }
            } catch (PhoneNumberException | SexCharException | BirthdayNumberException | FioNumberException |
                     DataException e) {
                System.out.println( e.getMessage() );
            }

        } catch (IOException e) {
            System.out.println( e.getMessage() );

        }
    }

    public static int findData(String[] data) {
        if (data.length < 6) {
            return -1;
        } else if (data.length > 6) {
            return -2;
        } else {
            return data.length;
        }
    }

    public static int findNumber(String[] data) {
        int integ = data.length;
        for (String item : data) {
            try {
                Double.parseDouble( item );
                if (item.length() != 11) {
                    integ--;
                }
            } catch (NumberFormatException e) {
                integ--;
            }
        }

        return integ;
    }

    public static int findChar(String[] data) {
        int integ = 0;
        for (String item : data) {
            if (item.equals( "m" ) || item.equals( "f" )) {
                integ++;
            }
        }
        return integ;
    }

    public static int findBirthday(String[] data) {
        int integ = 0;
        for (String item : data) {
            String[] d = item.split( "\\." );
            if (d.length == 3) {
                int integG = 3;
                for (String dat : d) {
                    try {
                        Integer.parseInt( dat );
                    } catch (NumberFormatException e) {
                        integG--;
                    }
                }
                if (integG == 3) {
                    if (d[0].length() == 2 && d[1].length() == 2 && d[2].length() == 4) {
                        integ++;
                    }
                }
            }
        }
        return integ;
    }

    public static int findFio(String[] data) {
        int integ = 0;
        for (String item : data) {
            if (item.length() > 1) {
                int charCouunt = 0;
                for (int i = 0; i < item.length(); i++) {
                    char c = item.charAt( i );
                    if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= 'А' && c <= 'Я') || (c >= 'а' && c <= 'я')) {
                        charCouunt++;
                    }
                }
                if (charCouunt == item.length()) {
                    integ++;
                }
            }
        }
        return integ;
    }
}