package ActionWithCase;

import Case.ListOfCases;

public class ShowListOfAllCases implements IAction {
    @Override
    public ListOfCases makeAction(ListOfCases listOfCases, String fileName, String fineName1) {
        System.out.println("Список всех дел");
        listOfCases.showListOfAllCases();
        return listOfCases;
    }
}
