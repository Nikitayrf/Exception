/* 3. Если необходимо, исправьте данный код :
public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}

*
* */

package task3;

public class Main {
    public static void main(String[] args) {
        int a = 90;
        int b = 3;
        if (b == 0) {
            System.out.println("Проверьте b, делитель должен быть не 0");
        } else {
            System.out.println( a / b);
        }
        printSum( 23, 234 );

        int[] abc = {1, 2};
        int index = 1;
        if (index < abc.length) {
            abc[index] = 9;
        } else {
            System.out.println("Проверьте индекс массива, он должен быть меньше длины массива.");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}

/*
 Исключения в примере кода откносяться к Unchecked Exception соответственно, такие исключения не нужно обрабатывать
 с помощью try-catch.
 В методе printSum() нет необходимости пробрасывать исключение FileNotFoundException, так как не используется файл.
 */