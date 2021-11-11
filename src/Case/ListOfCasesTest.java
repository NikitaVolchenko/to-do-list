package Case;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListOfCasesTest {
    @Test
    public void test() {
        ListOfCases listOfCases = new ListOfCases();
        List<Case> list = new ArrayList<>();

        Case case1 = new Case("дело", "дельное", Importance.UNKNOWN.getByString("важно"), Status.NOT_DONE.getByString("не выполнено"));
        listOfCases.addCase(case1);
        list.add(case1);

        case1 = new Case("дело1", "дельное1", Importance.UNKNOWN.getByString("неважно"), Status.NOT_DONE.getByString("выполнено"));
        listOfCases.addCase(case1);
        list.add(case1);

        case1 = new Case("дело2", "дельное2", Importance.UNKNOWN.getByString("некритично"), Status.NOT_DONE.getByString("не выполнено"));
        listOfCases.addCase(case1);
        list.add(case1);

        Assertions.assertArrayEquals(list.toArray(), listOfCases.getToDoList().toArray());

        listOfCases.deleteCase(0);
        Assertions.assertEquals(list.size() - 1, listOfCases.size());

        listOfCases.markAsCompleted(1);
        Assertions.assertTrue(listOfCases.getToDoList().get(1).getStatus().isValue());
    }
}