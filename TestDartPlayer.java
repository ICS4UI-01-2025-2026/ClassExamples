import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestDartPlayer {
    
    private DartPlayer player;

    @Before
    public void setUp(){
        player = new DartPlayer();
    }

    @Test
    public void playerCreation(){
        assertNotNull(player);
        assertEquals(501, player.getScore());
    }

    @Test
    public void testSingleDart(){
        player.throwDart(15, 1);
        assertEquals(486, player.getScore());
    }

    @Test
    public void testDoubleDart(){
        player.throwDart(15, 2);
        assertEquals(471, player.getScore());
    }

    @Test
    public void testTripleDart(){
        player.throwDart(15, 3);
        assertEquals(456, player.getScore());
    }

    @Test
    public void testBust(){
        hit180();
        hit180();
        // 141 left
        player.throwDart(20, 3);
        player.throwDart(20, 3);
        // should be at 21 points
        player.throwDart(7, 3);
        assertEquals(141, player.getScore());
    }

    private void hit180(){
        player.throwDart(20, 3);
        player.throwDart(20, 3);
        player.throwDart(20, 3);
    }


}
