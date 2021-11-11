package ActionWithCase;

import Case.ListOfCases;
import InputAndOutput.ReadAndWriteFromFile;

public class SaveChanges implements IAction {
    @Override
    public ListOfCases makeAction(ListOfCases listOfCases, String fileName, String fineName1) {
        ReadAndWriteFromFile readAndWriteFromFile1 = new ReadAndWriteFromFile();
        readAndWriteFromFile1.write(fileName, listOfCases);
        readAndWriteFromFile1.write(fineName1, listOfCases);
        System.out.println("Сохранение завершено!");
        return listOfCases;
    }
}
