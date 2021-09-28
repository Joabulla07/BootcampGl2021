package Model;

import Model.FactoryPattern.HenTestFactory;
import com.joanna.constants.Color;
import com.joanna.Model.Egg;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class EggTest {

    private final static Logger log = Logger.getLogger(HenTestFactory.class);

    Egg redEgg = new Egg(Color.RED);
    Egg whiteEgg = new Egg(Color.WHITE);
    Egg nullEgg = new Egg(null);

    @Test
    public void getColorTest(){
        Egg redEgg1 = mock(Egg.class);
        when(redEgg1.getColor()).thenReturn(Color.RED);

        Egg whiteEgg1 = mock(Egg.class);
        when(whiteEgg1.getColor()).thenReturn(Color.WHITE);

        Assert.assertEquals(redEgg1.getColor(), redEgg.getColor());
        Assert.assertEquals(whiteEgg1.getColor(), whiteEgg.getColor());
        Assert.assertNull(nullEgg.getColor());
        log.info("getColorTest Passed");
    }

    @Test
    public void toStringTest() {
        Egg redEgg1 = mock(Egg.class);
        when(redEgg1.toString()).thenReturn("(D)");

        Egg whiteEgg1 = mock(Egg.class);
        when(whiteEgg1.toString()).thenReturn("(O)");

        Egg nullEgg1 = mock(Egg.class);
        when(nullEgg1.toString()).thenReturn("(G)");

        Assert.assertEquals(redEgg1.toString(), redEgg.toString());
        Assert.assertEquals(whiteEgg1.toString(), whiteEgg.toString());
        Assert.assertEquals(nullEgg1.toString(), nullEgg.toString());
        log.info("toStringTest Passed");
    }

    @Test
    public void equalsTest(){
        Assert.assertNotEquals(redEgg, whiteEgg);
        log.info("equalsTest Passed");
    }
}
