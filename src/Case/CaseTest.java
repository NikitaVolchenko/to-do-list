package Case;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaseTest {
    @Test
    public void test() {
        Case case1 = new Case("дело", "дельное", Importance.UNKNOWN.getByString("важно"), Status.NOT_DONE.getByString("не выполнено"));
        Assertions.assertEquals("дело", case1.getName());
        Assertions.assertEquals("дельное", case1.getDescription());
        Assertions.assertEquals("важно", case1.getImportance().getValue());
        Assertions.assertFalse(case1.getStatus().isValue());
    }
}