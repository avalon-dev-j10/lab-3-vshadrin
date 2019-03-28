package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.*;
import ru.avalon.java.dev.j10.labs.sort.*;

public class Main {

    public static void main(String[] args) {
        FibonacciInitializer fib = new FibonacciInitializer();
        RandomInitializer rand = new RandomInitializer();
        BubbleSort bubSort = new BubbleSort();
        SelectionSort seSort = new SelectionSort();
        ShellSort shSort = new ShellSort();
        
        // Числа Фибоначчи
        int[] array = new int[20];
        double sum = 0;
        
        System.out.print("Числа фибоначчи: ");
       fib.initialize(array);
       for(int i = 0; i<array.length; i++){
       System.out.print(array[i] + " ");
       }
       for(int i = 0; i< array.length; i++){
       sum = sum + array[i];
       }
       // Суммирование чисел Фибоначчи
        System.out.println("Сумма:"+sum);  
        System.out.println();
        
        // Рандомные числа от -50 до 50
         System.out.print("Рандомные числа от -50 до 50: ");
        rand.initialize(array);
        for(int i = 0; i<array.length; i++){
       System.out.print(array[i] + " ");
       }
        System.out.println();
        
        // Сортировка пузырьком
        System.out.print("Сортировка пузырьком: ");
        rand.initialize(array);
        bubSort.sort(array);
        for(int i = 0; i<array.length; i++){
       System.out.print(array[i] + " ");
       }
        System.out.println();
        
        // Сортировка селекцией
        System.out.print("Сортировка селекцией: ");
        rand.initialize(array);
        seSort.sort(array);
        for(int i = 0; i<array.length; i++){
       System.out.print(array[i] + " ");
       }
        System.out.println();
        
        // Сортировка ракушкой
        System.out.print("Сортировка ракушкой: ");
        rand.initialize(array);
        shSort.sort(array);
        for(int i = 0; i<array.length; i++){
       System.out.print(array[i] + " ");
       }
        System.out.println();
        /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
    }
}
