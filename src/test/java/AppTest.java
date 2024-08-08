import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testMultiply() {
        assertEquals(6, App.multiply(2, 3));
        assertEquals(-5, App.multiply(-1, 5));
        assertEquals(0, App.multiply(0, 3));
    }

    @Test
    public void testAdd() {
        assertEquals(5, App.add(2, 3));
        assertEquals(4, App.add(-1, 5));
        assertEquals(3, App.add(0, 3));
    }
}