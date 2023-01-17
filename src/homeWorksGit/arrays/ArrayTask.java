package homeWorksGit.arrays;

public class ArrayTask {
    //Вывести первые 3 элемента массива (Вывести первые 3 элемента массива используя цикл for).
    public static void main(String[] args) {
        int [] numbers = {14, 15, 8, 98, 2, 89};
        for (int i = 0; i < 3; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    /*Вывести первую половину массива
    (Вывести первую первую половину элементов массива при помощи цикла for).
    Реализация задачи должна работать при любом чётном количестве элементов. */
        for (int i = 0; i < numbers.length/2; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    /*Вывести вторую половину массива (Вывести вторую половину элементов массива
    при помощи цикла for). Реализация задачи должна работать при любом чётном количестве
    элементов.    */
        for (int i = numbers.length/2; i < numbers.length ; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    //Вывести все элементы кроме первого и последнего.
        for (int i = 1; i < numbers.length - 1 ; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    //Вывести последние 3 элемента массива (Для массива [7, -3, 9, -11, 18, 99, 2, 11] вывод должен быть таким: 99, 2, 11)
        int[] numbersTwo ={7, -3, 9, -11, 18, 99, 2, 11};
        for (int i = numbersTwo.length - 3;  i < numbersTwo.length ; i++) {
            System.out.print(numbersTwo[i] + " ");
        }
        System.out.println();

    /*Вывести чётные элементы массива по порядку (Вывести только чётные элементы массива по порядку
    (каждый второй элемент). Необходимо будет вывести второй, четвёртый, шестой и т.д. элементы.
    Позиции (индексы) для необходимых элементов: 1, 3, 5...n (постоянное увеличение на 2).*/
        for (int i = 1; i < numbers.length ; i++) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();

    /*Вывести количество положительных и отрицательных элементов (Необходимо определить количество
    положительных и отрицательных элементов в массиве и вывести его). В реализации задачи понадобится
    определить 2 переменные для хранения количества элементов: Одна переменная для хранения количества
    положительных элементов, допустим positiveCount. Вторая для хранения количества отрицательных элементов,
    допустим negativeCount. Названия переменных можно выбирать на своё усмотрение.*/
        int positiveNumber = 0;
        int negativeNumber = 0;
        for (int i = 0; i < numbersTwo.length; i++) {
            if(numbersTwo[i] > 0){
                positiveNumber++;
            }else negativeNumber++;
        }
        System.out.print("Отрицательных " + negativeNumber + ", положительных " + positiveNumber);
        System.out.println();

    /*Вывести элементы массива которые больше предыдущего (Необходимо вывести все элементы массива которые
    больше чем впереди стоящий). Для массива [7, -3, 9, -11, 18, 99, 2, 11] вывод должен быть таким: 9, 18, 99, 11.*/
        for (int i = 1; i <numbersTwo.length ; i++) {
            if (numbersTwo[i] > numbersTwo[i - 1] )
                System.out.print(numbersTwo[i] + " ");
        }
        System.out.println();

    /*Найти максимальный и минимальный элементы массива (Необходимо определить максимальный и минимальный
    элементы в массиве и вывести их).*/
        int maxNumber = 0;
        int minNumber = 0;
        for (int i = 0; i < numbersTwo.length; i++) {
            if (numbersTwo[i] > maxNumber) {
                maxNumber = numbersTwo[i];
            }
            if (numbersTwo[i] < minNumber) {
                minNumber = numbersTwo[i];
            }
        }
        System.out.println("Максимально число равно " + maxNumber + ", минимальное число равно " + minNumber);
    }
}
