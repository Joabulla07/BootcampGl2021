package Model;

import Model.FactoryPattern.FactoryHenTest;
import com.joanna.Enums.Color;
import com.joanna.Model.Egg;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class EggTest {

    private final static Logger log = Logger.getLogger(FactoryHenTest.class);
    Egg redEgg = new Egg(Color.RED);
    Egg whiteEgg = new Egg(Color.WHITE);
    Egg nullEgg = new Egg(null);

    @Test
    public void getColorTest(){
        Assert.assertEquals(Color.RED, redEgg.getColor());
        Assert.assertEquals(Color.WHITE, whiteEgg.getColor());
        Assert.assertNull(nullEgg.getColor());
        log.info("getColorTest Passed");
    }

    @Test
    public void toStringTest() {
        Assert.assertEquals("(D)", redEgg.toString());
        Assert.assertEquals("(O)", whiteEgg.toString());
        Assert.assertEquals("(G)", nullEgg.toString());
        log.info("toStringTest Passed");
    }

    @Test
    public void equalsTest(){
        Assert.assertNotEquals(redEgg, whiteEgg);
        log.info("equalsTest Passed");
    }
}
