/* 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.*/
package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(isFloat());

    }

    public static float isFloat() {
        float number = 0;
        try (Scanner iScanner = new Scanner( System.in )) {
            boolean isTrue = true;

            while (isTrue) {
                System.out.print( "Введите число, типа float : " );
                boolean flag = iScanner.hasNextFloat();
                String inputString = iScanner.nextLine();
                if (flag) {
                    isTrue = false;
                    number = Float.parseFloat( inputString );
                }
            }
        }
        return number;
    }
}
