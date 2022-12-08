public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
    task5();
}

    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2016;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
           if  (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else  {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }
        public static void task3 () {
            System.out.println("Задача 3");
            int year = 2100;
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 98;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        if (deliveryDistance > 100) {
            deliveryDays++;
        }

        System.out.println("Потребуется дней:" + deliveryDays);

    }

    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 5;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Это зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}