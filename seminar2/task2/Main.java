/* 2. Если необходимо, исправьте данный код :
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
*/

package task2;

public class Main {
    public static void main(String[] args) {

        double[] intArray = new double[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        int d = 0;
        int indexDiv = 8;

        if (d != 0) {
            if (indexDiv < intArray.length) {
                double catchedRes1 = intArray[indexDiv] / d;
                System.out.println( "catchedRes1 = " + catchedRes1 );

            } else {
                System.out.println( "Проверьте индекс делимого" );
            }
        } else {
            System.out.println( "Проверьте делитель" );
        }
    }
}

/*  1. Исключение в коде ArithmeticException и ArrayIndexOutOfBoundsException относятся к Unchecked Exception,
    которые следует обрабатывать не через конструкцию try-catch, а через другие конструкции например if.
    2. В intArray[8] используется магическое число 8, его следует заменить на переменную.
 */
/* try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
 */