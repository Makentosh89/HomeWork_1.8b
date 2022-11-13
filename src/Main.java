import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Заполняет массив случайными числами от 1 до 100· Выводит среднее арифметическое чисел
        от 1 до 30 (включительно) и их количество· Выводит среднее арифметическое чисел
        от 31 до 60(включительно) и их количество· Выводит среднее арифметическое чисел
        от 61 до 100(включительно) и их количество
        Пример:•Введите размер массива: 6•
        Ваш массив =•12 1 50 44 90 1
        •от 1 до 30 => 4.667, количество 3
         от 31 до 60 => 47, количество 2
         от 61 до 100 => 90, количество 1
        */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива :");
        int size = scanner.nextInt();
        int number[] = new int[size];

        int countLess30=0;
        int countMore30=0;
        int countMore60=0;

        int sumLess30 = 0;
        int sumMore30=0;
        int sumMore60=0;

        for (int i = 0; i < size; i++) {
            number[i] = random.nextInt(101 - 1 + 1) + 1;
            System.out.println(number[i]);
        }
        for (int i = 0; i < size; i++) {
            if (number[i]>1 && number[i]<=30){
                countLess30++;
                sumLess30+=number[i];
            }if (number[i]>30 && number[i]<=60){
                countMore30++;
                sumMore30+=number[i];
            }if (number[i]>60 && number[i]<=100){
                countMore60++;
                sumMore60++;
            }
        }
        System.out.println("от 1 до 30 = " + "avg= " +(float)sumLess30/countLess30+",количество = "+countLess30);
        System.out.println("от 30 до 60 = " + "avg= " + (float)sumMore30/countMore30+",количество = "+countMore30);
        System.out.println("от 60 до 100 = " + "avg= " +(float)sumMore60/countMore60+",количество = "+countMore60);
    }
}

