package ActionWithCase;

import Case.Case;
import Case.ListOfCases;

public class AddCase implements IAction {
    @Override
    public ListOfCases makeAction(ListOfCases listOfCases, String fileName, String fineName1) {
        Case case1 = new Case();
        case1 = case1.makeCaseFromConsole();
        listOfCases.addCase(case1);
        return listOfCases;
    }
}
