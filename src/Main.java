import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // Условный оператор 2
        // Домашняя работа 2
        // Задание 1
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Не известная версия операционной системы");
        }
        // Задание 2
        System.out.println("Задание 2");
        int clientDeviceyear = 2015;
        if (clientOS == 0 && clientDeviceyear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceyear >= 2015) {
            System.out.println("Установите  обычную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceyear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите  обычную версию приложения для Android по ссылке");
        }
        // Задание 3
        System.out.println("Задание 3");
        int year = 2021;
        if (year > 1584)
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        // Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
            System.out.println("Потребуется " + deliveryDays + " день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = 1 + 1;
            System.out.println("Потребуется " + deliveryDays + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = 1 + 1 + 1;
            System.out.println("Потребуется " + deliveryDays + " дня");
        } else {
            System.out.println("Не доставляется");
        }
        // Задание 5
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("1-й месяц он же Январь");
                break;
            case 2:
                System.out.println("2-й месяц он же Февраль");
                break;
            case 3:
                System.out.println("3-й месяц он же Март");
                break;
            case 4:
                System.out.println("4-й месяц он же Апрель");
                break;
            case 5:
                System.out.println("5-й месяц он же Май");
                break;
            case 6:
                System.out.println("6-й месяц он же Июнь");
                break;
            case 7:
                System.out.println("7-й месяц он же Июль");
                break;
            case 8:
                System.out.println("8-й месяц он же Август");
                break;
            case 9:
                System.out.println("9-й месяц он же Сентябрь");
                break;
            case 10:
                System.out.println("10-й месяц он же Октябрь");
                break;
            case 11:
                System.out.println("11-й месяц он же Ноябрь");
                break;
            case 12:
                System.out.println("12-й месяц он же Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("принадлежит к сезону осень");
                break;
            default:
                System.out.println("Такого сезона не существует");
        }
    }
}