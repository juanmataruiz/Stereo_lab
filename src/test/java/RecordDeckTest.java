import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before() {
        recordDeck = new RecordDeck();
    }

    @Test
    public void hasPlaySpeed() {
        assertEquals(1, recordDeck.getPlaySpeed(),0.01);
    }

    @Test
    public void canChangeSpeed() {
        recordDeck.changePlaySpeed(0.5);
        assertEquals(0.5, recordDeck.getPlaySpeed(),0.01);
    }
}
