package Lesson2;

//В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException
// и MyArrayDataException и вывести результат расчета.

public class Exceptions {
    public static void main(String[] args) {
        String[][] twoArray = {{"1", "3", "1", "1"}, {"1", "1", "1", "1"}, {"2", "2", "2", "4"}, {"3", "9", "8", "0"}};
        MyArraySizeException(twoArray);
        MyArrayDataException(twoArray);
    }
//Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
// При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

    public static void MyArraySizeException (String[][] twoArray) {
        if (twoArray.length == 4) {
            for (String[] strings : twoArray) {
                if (strings.length == 4) {
                    for (String string : strings) {
                        System.out.print(string + " ");
                    }
                } else throw new ArrayIndexOutOfBoundsException("Размер массива не равен 4");
                System.out.println();
            }
        } else throw new ArrayIndexOutOfBoundsException("Размер массива не равен 4");
    }

//Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст
// вместо числа), должно быть брошено исключение MyArrayDataException с детализацией,
// в какой именно ячейке лежат неверные данные.
public static void MyArrayDataException (String[][] twoArray){
        int sum = 0;
        boolean flag = true;
        for (int i = 0; i < twoArray.length; i++) {
             for (int j = 0; j < twoArray[i].length; j++) {
                 try {
                     sum = sum + Integer.parseInt(twoArray[i][j]);
                 }
                 catch (NumberFormatException e){
                     flag = false;
                     System.out.println("Элемент с индексом " + i + " " + j + " не число");
                     break;
                 }
               }
             }
        System.out.println();
        if (flag) {
            System.out.println("Сумма преобразованных элементов\n" + sum);
        }
    }
}
