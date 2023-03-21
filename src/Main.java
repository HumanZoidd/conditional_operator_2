public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

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

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високостным");
        } else {
            System.out.println(year + " год не является високостным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte deliveryDistance = 20;
        if (deliveryDistance < 20) {
            System.out.println("Досавка карты займёт 1 сутки");
        }
        if (deliveryDistance <= 60 && deliveryDistance >= 20) {
            System.out.println("Доставка карты займёт 2 суток");
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка карты займет 3 суток");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставка карты невозможна");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte monht = 1;
        switch (monht) {
            case 1, 2, 12:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Это точно не на Земле");
        }
    }
}

