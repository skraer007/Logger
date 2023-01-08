package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int size = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int maxNumber = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        List<Integer> source = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            source.add(random.nextInt(maxNumber));
        }
        System.out.println("Вот случайный список: " + source);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int f = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(f);
        List<Integer> result = filter.filterOut(source);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);
        logger.log("Завершаем программу");
    }
}