import java.time.LocalDate;

public class Main {
    public static int checkLeapYear (int yearInput) {
        if (yearInput % 4 == 0 && yearInput % 100 != 0 || yearInput % 400 == 0) {
            System.out.println(yearInput + " год является високосным");
        }
        else System.out.println(yearInput + " год не является високосным");
        return yearInput;
    }
    public static void determineDownloadVersion (int clientDeviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear == currentYear && clientOS == 0) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear == currentYear && clientOS == 1) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
        if (clientOS != 0 && clientOS != 1 || clientDeviceYear > currentYear) {
            System.out.println("Введите корректные значения");
        }
    }
    public static int determineDeliveryTime (int deliveryDistance ) {
        int daysForDelivery = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + daysForDelivery);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (daysForDelivery + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (daysForDelivery + 2));
        }
        else {
            System.out.println("Доставка не осуществляется");
        }
        return deliveryDistance;
    }
    public static void main(String[] args) {
        System.out.println("Домашнее задание");
        //Задача 1
        System.out.println("Задача 1");
        int yearInput = 2024;
        checkLeapYear(yearInput);
        //Задача 2
        System.out.println("Задача 2");
        int clientDeviceYear = 2021;
        int clientOS = 0;
        determineDownloadVersion(clientDeviceYear, clientOS);
        //Задача 3
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        determineDeliveryTime(deliveryDistance);
    }
}