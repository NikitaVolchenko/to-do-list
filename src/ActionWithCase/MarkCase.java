package ActionWithCase;

import Case.ListOfCases;
import Menu.MakeChoice;

public class MarkCase implements IAction {
    @Override
    public ListOfCases makeAction(ListOfCases listOfCases, String fileName, String fineName1) {
        listOfCases.showListOfAllCases();
        System.out.println("Введите индекс дела");
        listOfCases.markAsCompleted(new MakeChoice().consoleInput(0, listOfCases.size() - 1));
        return listOfCases;
    }
}
