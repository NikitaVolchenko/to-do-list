package Case;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaseTest {
    @Test
    public void test() {
        Case case1 = new Case("дело", "дельное", "дело всей жизни", false);
        Assertions.assertEquals("дело", case1.getName());
        Assertions.assertEquals("дельное", case1.getDescription());
        Assertions.assertEquals("дело всей жизни", case1.getImportance());
        Assertions.assertFalse(case1.isStatus());
    }
}