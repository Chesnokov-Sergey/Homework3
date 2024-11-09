import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // Условный оператор
        // Домашняя работа 1
        // Задание 1
        System.out.println("Задание 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен "+ age +" то он не достиг совершеннолетия, нужно немного подождать");
        }
        int age1 = 17;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то  он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age1 + " то он не достиг совершеннолетия, нужно немного подождать");
        }
        // Здание 2
        System.out.println("Задание 2");
        int temperature = 3;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        int temperature1 = 7;
        if (temperature1 <= 5) {
            System.out.println("На улице " + temperature1 + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature1 + " градусов, можно идти без шапки");
        }
        // Здание 3
        System.out.println("Задание 3");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " ,то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " ,то можно ездить спокойно");
        }
        int speed1 = 59;
        if (speed1 > 60) {
            System.out.println("Если скорость " + speed1 + " ,то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed1 + " ,то можно ездить спокойно");
        }
        // Задание 4
        System.out.println("Задание 4");
        int human = 4;
        if (human >= 2 && human < 6) {
            System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить в детский сад");
        } else {
            System.out.println("Ему не нужно ходить в детский сад");
        }
        int human1 = 10;
        if (human1 >= 7 && human1 < 17) {
            System.out.println("Если возраст человека равен " + human1 + ", то ему нужно ходить в школу");
        } else {
            System.out.println("Ему не нужно ходить в школу");
        }
        int human2 = 20;
        if (human2 >= 18 && human2 <= 24) {
            System.out.println("Если возраст человека равен " + human2 + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Ему не нужно нужно ходить в университет");
        }
        int human3 = 30;
        if (human3 > 24) {
            System.out.println("Если возраст человека равен " + human3 + ", то ему нужно ходить на работу");
        } else {
            System.out.println("Ему не нужно ходить на работу");
        }
        // Задание 5
        System.out.println("Задание 5");
        int child = 1;
        if (child < 5) {
            System.out.println("Если возраст ребенка равен " + child + ", то он не может кататься на аттракционе");
        }
        if (child >= 5 && child < 14) {
            System.out.println("Если возраст ребенка равен " + child + ", то он может кататься только в сопровождении взрослого, Если взрослого нет, то кататься нельзя");
        }
        if (child >= 14) {
            System.out.println("Если возраст ребенка равен " + child + ", то он может кататься без сопровождения взрослого");
        }
        // Задание 6
        System.out.println("Задание 6");
        int carCapacity = 33;
        if (carCapacity <= 60) {
            System.out.println("В вагоне есть место, оно сидячее");
        } else if (carCapacity > 60 && carCapacity <= 102) {
            System.out.println("В вагоне есть место, оно стоячее");
        } else if (carCapacity > 102){
            System.out.println("Вагон уже полностью забит");
        }
        // Задание 7
        System.out.println("Задание 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one>two && one>three) {
            System.out.println("Большее чило " + one);
        } else if (two>one && two>three) {
            System.out.println("Большее чило " + two);
        } else if (three>one && three>two) {
            System.out.println("Большее чило " + three);
        }


















    }
}