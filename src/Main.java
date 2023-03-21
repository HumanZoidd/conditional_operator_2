public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        // task3();
        // task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte clientOS = 3;
        if (clientOS == 0) {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        } else if (clientOS == 1) {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        } else {
            System.out.println("«Иные OS не поддерживаются»");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 3;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        } else if (clientDeviceYear < 2015) {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке»");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        } else if ((clientDeviceYear < 2015)) {
            System.out.println("«Установите облегченную версию приложения для Android по ссылке»");
        }
        if (clientOS != 0 && clientOS != 1) {
            System.out.println("Другие ОС не поддерживаются");
        }
    }
}

