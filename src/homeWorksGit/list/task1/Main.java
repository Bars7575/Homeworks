package homeWorksGit.list.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //String newTask = scanner.nextLine();
        boolean isTrue = false;

        while (!isTrue) {
            System.out.println("Меню: \n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "0. Выход");
            int taskNum = Integer.parseInt(scanner.nextLine());
            switch (taskNum) {
                case 0:
                    isTrue = true;
                    break;
                case 1:
                    System.out.println("Введите новое задание");
                    String value = scanner.nextLine();
                    toDoList.add(value);
                    break;
                case 2:
                    System.out.println("Список задач:");
                    for (int i = 0; i < toDoList.size(); i++) {
                        System.out.println((i+1) + ". " + toDoList.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Выбирите задачу которую вы хотите удалить:");
                    for (int i = 0; i < toDoList.size(); i++) {
                        System.out.println((i+1) + ". " + toDoList.get(i));
                    }

                    int choseNum = Integer.parseInt(scanner.nextLine());
                    if (choseNum < 0 || choseNum > toDoList.size()) {
                        System.out.println("вы ввели не существуещее задание");
                    } else
                        toDoList.remove(choseNum - 1);
                    System.out.println(toDoList);
                    break;
                default:
                    isTrue = true;
            }
        }
    }
}
