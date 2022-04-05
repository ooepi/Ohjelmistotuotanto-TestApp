import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AppTest {

    @Test
    public void testSum() {
        assertEquals(10, App.sum(6, 4));
        assertEquals(0, App.sum(0, 0));
        assertEquals(0, App.sum(-6, 6));
    }

    @Test
    public void testDivide() {
        assertEquals(1.333, App.divide(4, 3));
        assertEquals(0.0, App.divide(0, 1));
        assertEquals(Double.NaN, App.divide(1, 0));
    }

    @Test
    public void testFirstTwo() {
        assertEquals("qw", App.firstTwo("qwerty"));
        assertEquals("VA", App.firstTwo("VA"));
        assertEquals("V", App.firstTwo("V"));
        assertEquals("", App.firstTwo(""));
        assertEquals(null, App.firstTwo(null));
    }

    @Test
    public void testDiv() {
        assertEquals(1.33, App.div(new Double(4), new Double(3)), 0.01);
        assertEquals(33.0, App.div(new Double(99), new Double(3)));
        assertEquals(null, App.div(null, new Double(3)));
        assertEquals(null, App.div(new Double(3), null));
        assertEquals(null, App.div(new Double(3), new Double(0)));
    }



}
