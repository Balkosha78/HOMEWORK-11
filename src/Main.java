import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2024;
        boolean yearLeap = isYearLeap(year);
    }

    public static boolean isYearLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "год — високосный год");
            return true;
        } else {
            System.out.println(year + "год — невисокосный год");
            return false;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        defineTypeOs(0, 2023);
    }

    public static void defineTypeOs(int type, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (type == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке ");
            }
        } else if (type == 1) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке ");
            }
        }
    }

    public static void task3() {
         System.out.println("Задача 3");
        int deliveryDistance = 95;
        int time = calculateTime(deliveryDistance);
            System.out.println("Потребуется дней: " + time + " для дистанции " + deliveryDistance);
    }

    public static int calculateTime(int deliveryDistance) {
        if (deliveryDistance <= 0 || deliveryDistance > 100){
            return -1;
        }
        int time = 1;
            if (deliveryDistance >= 20) {
            ++time;
        }
            if (deliveryDistance >= 60) {
            ++time;
        }
            return time;
        }
}


