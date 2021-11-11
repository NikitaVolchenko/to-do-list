package ActionWithCase;

import Case.ListOfCases;

public class ShowListOfCompletedCases implements IAction {
    @Override
    public ListOfCases makeAction(ListOfCases listOfCases, String fileName, String fineName1) {
        System.out.println("Список выполненных дел");
        listOfCases.showListOfCompletedCases();
        return listOfCases;
    }
}
