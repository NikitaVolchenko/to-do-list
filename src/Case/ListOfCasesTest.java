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

        Case case1 = new Case("дело", "дельное", "дело всей жизни", false);
        listOfCases.addCase(case1);
        list.add(case1);

        case1 = new Case("дело1", "дельное1", "дело всей жизни1", true);
        listOfCases.addCase(case1);
        list.add(case1);

        case1 = new Case("дело2", "дельное2", "дело всей жизни2", false);
        listOfCases.addCase(case1);
        list.add(case1);

        Assertions.assertArrayEquals(list.toArray(), listOfCases.getToDoList().toArray());

        listOfCases.deleteCase(0);
        Assertions.assertEquals(list.size() - 1, listOfCases.size());

        listOfCases.markAsCompleted(1);
        Assertions.assertTrue(listOfCases.getToDoList().get(1).isStatus());
    }
}