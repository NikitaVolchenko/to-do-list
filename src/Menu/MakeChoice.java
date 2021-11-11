package Menu;

import java.util.Scanner;

public class MakeChoice {
    public int consoleInput(int leftBorder, int rightBorder) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от " + leftBorder + " до " + rightBorder + ": ");
        int number = 0;

        boolean flag = true;
        while (flag) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
            }
            if (number > rightBorder || number < leftBorder) {
                System.out.println("Неккоректное число! Повторите ввод");
                System.out.print("Введите число от " + leftBorder + " до " + rightBorder + ": ");
            } else {
                flag = false;
            }
        }
        return number;
    }
}
