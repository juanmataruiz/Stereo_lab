import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDTest {
    CD cd1;

    @Before
    public void before() {
        cd1 = new CD("La vida loca");
    }

    @Test
    public void hasTitle() {
        assertEquals("La vida loca", cd1.getTitle());
    }

}
