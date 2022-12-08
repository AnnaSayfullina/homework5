public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
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
        int clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2012;
        if ( (year % 400) == 0 ){
            System.out.println(year + " год является високосным");
        } else if ( (year % 4) == 0 && (year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 101;
        int deliveryDays = 1;
        if (deliveryDistance <=20) {
            System.out.println("Потребуется дней:" + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <=60) {
            System.out.println("Потребуется дней:" + (deliveryDays + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней:" + (deliveryDays + 2));
        } else {
            System.out.println("Потребуется дней:" + (deliveryDays + 3));
        }
    }
}