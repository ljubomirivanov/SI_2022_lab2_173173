import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    SILab2 tester = new SILab2();

    List<String> createList(String... s) {
        return new ArrayList<>(Arrays.asList(s));
    }

    @Test
    void testEveryBranch() {
        Exception ex = null;
        ex = assertThrows(IllegalArgumentException.class, () -> tester.function(new ArrayList<>()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        assertEquals(createList("0", "1", "#", "2", "#"), tester.function(createList("0", "0", "#", "0", "#")));
    }

    @Test
    void testEveryPath()
        Exception ex = null;
        ex = assertThrows(IllegalArgumentException.class, () -> tester.function(new ArrayList<>()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        assertEquals(createList("#"), tester.function(createList("#")));

        assertEquals(createList("0"), tester.function(createList("0")));

        assertEquals(createList("#", "1"), tester.function(createList("#", "0")));

        assertEquals(createList("1", "#"), tester.function(createList("0", "#")));

        assertEquals(createList("#", "2", "#"), tester.function(createList("#", "0", "#")));
    }
}