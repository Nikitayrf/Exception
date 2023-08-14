/* Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner iScanner = new Scanner( System.in )) {
            System.out.print("Введите не пустую строку : ");
            String inputString = iScanner.nextLine();
            boolean flag = inputString.isEmpty();
            if (flag) {
                throw new RuntimeException("Пустые строки вводить нельзя");
            }
        }
    }
}
