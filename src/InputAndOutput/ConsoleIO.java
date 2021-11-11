package InputAndOutput;

import Case.*;
import Menu.*;

public class ConsoleIO implements IInputAndOutput {
    @Override
    public void start() {
        String fileName = "D:\\Users\\user\\IdeaProjects\\to do list\\fileForRead.txt";
        String fineName1 = "D:\\Users\\user\\IdeaProjects\\to do list\\fileForWrite.txt";
        ReadAndWriteFromFile readAndWriteFromFile = new ReadAndWriteFromFile();
        ListOfCases listOfCases = new ListOfCases(readAndWriteFromFile.read(fileName));

        MenuInConsole menu = new MenuInConsole();
        menu.choosingAction(listOfCases, fileName, fineName1);
    }
}
