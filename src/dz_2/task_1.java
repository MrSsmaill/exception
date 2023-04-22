package dz_2;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        enteringFractionalNumber();
    }

    public static void enteringFractionalNumber() {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        String stringNum;
        float num = 0;
        while (flag) {
            System.out.println("Введите дробное число");
            stringNum = scanner.nextLine();
            if (stringNum.isBlank()){
                System.out.println("Вы ввели не верное значение");
                continue;
            }
            try {
                num = Float.parseFloat(stringNum);
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не верное значение");
                continue;
            }
            if (num % 1 == 0) {
                System.out.println("Вы ввели не верное значение");
            } else {
                flag = false;
            }
        }
        System.out.println("Вы ввели " + num);
    }
}
