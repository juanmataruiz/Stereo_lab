import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {
    CDPlayer player;
    CD cd1;

    @Before
    public void before(){
        player = new CDPlayer();
        cd1 = new CD("vida loca");
    }

    @Test
    public void hasCDs(){
        assertEquals(0, player.getCDlist().size());
    }

    @Test
    public void canAddCD(){
        player.addCD(cd1);
        assertEquals(1, player.getCDlist().size());
    }
    @Test
    public void canRemoveAddCD(){
        player.addCD(cd1);
        player.removeCD(cd1);
        assertEquals(0, player.getCDlist().size());
    }
    @Test
    public void canPlay(){
        player.addCD(cd1);
        assertEquals("Now playing vida loca", player.play("vida loca"));
    }
}
