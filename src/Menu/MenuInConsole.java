package Menu;

import Case.*;
import ActionWithCase.*;

public class MenuInConsole {
    public void printMenuInConsole() {
        System.out.println("1) Добавить дело");
        System.out.println("2) Удалить дело");
        System.out.println("3) Пометить как выполненное");
        System.out.println("4) Показать список всех дел");
        System.out.println("5) Показать список выполненных дел");
        System.out.println("6) Сохранить изменения");
        System.out.println("7) Сохранить и выйти");
    }

    public void choosingAction(ListOfCases listOfCases, String fileName, String fineName1) {
        IAction[] iActions = {new AddCase(),
                new DeleteCase(),
                new MarkCase(),
                new ShowListOfAllCases(),
                new ShowListOfCompletedCases(),
                new SaveChanges()};

        boolean flag = true;
        while (flag) {
            printMenuInConsole();
            MakeChoice makeChoice = new MakeChoice();
            int choice = makeChoice.consoleInput(1, 7);
            if (choice < 7) {
                listOfCases = iActions[choice - 1].makeAction(listOfCases, fileName, fineName1);
            } else {
                listOfCases = iActions[5].makeAction(listOfCases, fileName, fineName1);
                flag = false;
                System.out.println("Выход!");
            }
        }
    }
}
