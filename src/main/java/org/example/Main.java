package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        room(scanner);
        color_room(scanner);
        Main main = new Main();
        main.furniture_choice(scanner);
        main.furniture_choice(scanner, "Комод");
        main.furniture_color(scanner);
        main.furniture_color(scanner, 3);
        main.furniture_material(scanner);

        scanner.close();
    }

    static void room(Scanner scanner) {
        System.out.println("Привет! В этом замке много комнат. Выбери одно число от 1-4");
        int scanners = scanner.nextInt();
        scanner.nextLine();

        switch (scanners) {
            case 1:
                System.out.println("Вы выбрали комнату допросов");
                break;
            case 2:
                System.out.println("Вы выбрали комнату для детских игр");
                break;
            case 3:
                System.out.println("Вы выбрали покои короля");
                break;
            case 4:
                System.out.println("Вы выбрали уборную рабов");
                break;
            default:
                System.out.println("Ты выбрал что-то не то");
                break;
        }
    }

    static void room(Scanner scanner, String roomName) {
        System.out.println("Вы выбрали " + roomName);
    }

    static void color_room(Scanner scanner) {
        String[] colors = {"Красный", "Оранжевый", "Желтый", "Зеленый", "Голубой", "Синий", "Фиолетовый"};

        System.out.println("Выберите цвет для комнаты (введите номер от 1 до 7):");
        for (int i = 0; i < colors.length; i++) {
            System.out.println((i + 1) + ". " + colors[i]);
        }

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice >= 1 && choice <= colors.length) {
            String selectedColor = getColor(choice);
            System.out.println("Выбранный цвет: " + selectedColor);
        } else {
            System.out.println("Неверный выбор цвета.");
        }
    }

    void furniture_choice(Scanner scanner) {
        System.out.println("Выберите мебель для комнаты (введите номер от 1 до 3):");
        System.out.println("1. Стул");
        System.out.println("2. Стол");
        System.out.println("3. Шкаф");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Вы выбрали стул");
                break;
            case 2:
                System.out.println("Вы выбрали стол");
                break;
            case 3:
                System.out.println("Вы выбрали шкаф");
                break;
            default:
                System.out.println("Неверный выбор мебели.");
                break;
        }
    }

    void furniture_choice(Scanner scanner, String furnitureName) {
        System.out.println("Вы выбрали " + furnitureName);
    }

    void furniture_color(Scanner scanner) {
        String[] colors = {"Красный", "Оранжевый", "Желтый", "Зеленый", "Голубой", "Синий", "Фиолетовый"};

        System.out.println("Выберите цвет мебели (введите номер от 1 до 7):");
        for (int i = 0; i < colors.length; i++) {
            System.out.println((i + 1) + ". " + colors[i]);
        }

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice >= 1 && choice <= colors.length) {
            String selectedColor = getColor(choice);
            System.out.println("Выбранный цвет мебели: " + selectedColor);
        } else {
            System.out.println("Неверный выбор цвета мебели.");
        }
    }

    void furniture_color(Scanner scanner, int colorIndex) {
        String selectedColor = getColor(colorIndex);
        System.out.println("Выбранный цвет мебели: " + selectedColor);
    }

    void furniture_material(Scanner scanner) {
        System.out.println("Выберите материал мебели:");
        System.out.println("1. Дерево");
        System.out.println("2. Металл");
        System.out.println("3. Пластик");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Вы выбрали дерево");
                break;
            case 2:
                System.out.println("Вы выбрали металл");
                break;
            case 3:
                System.out.println("Вы выбрали пластик");
                break;
            default:
                System.out.println("Неверный выбор материала мебели.");
                break;
        }
    }

    public static String getColor(int index) {
        String[] colors = {"Красный", "Оранжевый", "Желтый", "Зеленый", "Голубой", "Синий", "Фиолетовый"};
        return colors[index - 1];
    }
}
