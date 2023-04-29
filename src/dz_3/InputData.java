package dz_3;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class InputData {
    public static String[] input() {
        System.out.println("Введите данные в произвольном порядке, разделенные пробелом:\n" +
                "Фамилия Имя Отчество дата_рождения номер_телефона пол");
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String[] arrData = new String[0];
        String data = null;
        while (flag) {
//            data = scanner.nextLine();
            data = "03.04.2000 Петров 3266400 Перт m Иванович ";
            arrData = data.trim().split(" ");
            if (arrData.length > 6) {
                System.out.println("Вы ввели больше данных, чем требуется");
                System.out.println("Введите данные");
                continue;
            } else if (arrData.length < 6) {
                System.out.println("Вы ввели меньше данных, чем требуется");
                System.out.println("Введите данные");
                continue;
            }
            flag = false;
        }
        return arrData;
    }

    public static String lastName() {
        String result = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свою фамилию");
        result = scanner.nextLine();
        while (result.isBlank() || Checks.isChar(result)) {
            System.out.println("Вы ввели не верные данные");
            System.out.println("Введите свою фамилию");
            result = scanner.nextLine();
        }
        return result;
    }

    public static String firstName() {
        String result = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите своё имя");
        result = scanner.nextLine();
        while (result.isBlank() || Checks.isChar(result)) {
            System.out.println("Вы ввели не верные данные");
            System.out.println("Введите своё имя");
            result = scanner.nextLine();
        }
        return result;
    }

    public static String patronymicName() {
        String result = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите своё отчество");
        result = scanner.nextLine();
        while (result.isBlank() || Checks.isChar(result)) {
            System.out.println("Вы ввели не верные данные");
            System.out.println("Введите своё отчество");
            result = scanner.nextLine();
        }
        return result;
    }

    public static String date() throws ParseException {
        String date = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату рождения ");
        date = scanner.nextLine();
        while (!Checks.isDate(date)) {
            System.out.println("Вы ввели не верную дату");
            System.out.println("Введите дату рождения ");
            date = scanner.nextLine();
        }
        return date;
    }

    public static String gender() {
        String result = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш пол ");
        result = scanner.nextLine();
        while (!Checks.isSymbol(result)) {
            System.out.println("Вы ввели не верный пол");
            System.out.println("Введите Ваш пол ");
            result = scanner.nextLine();
        }
        return result;
    }

    public static String phoneNumber() {
        String result = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш номер телефона ");
        result = scanner.nextLine();
        while (!Checks.isDigit(result)) {
            System.out.println("Вы ввели не верный номер");
            System.out.println("Введите Ваш номер телефона ");
            result = scanner.nextLine();
        }
        return result;
    }

    public static String inputData(int num) throws ParseException {
        switch (num) {
            case (0):
                System.out.println("Вы не верно ввели свою фамилию");
                return lastName();
            case (1):
                System.out.println("Вы не верно ввели своё имя");
                return firstName();
            case (2):
                System.out.println("Вы не верно ввелиотчество");
                return patronymicName();
            case (3):
                System.out.println("Вы ввели не верную дату");
                return date();
            case (4):
                System.out.println("Вы ввели не верный номер");
                return phoneNumber();
            case (5):
                System.out.println("Вы ввели не верный пол");
                return gender();
        }
        return null;
    }
}
