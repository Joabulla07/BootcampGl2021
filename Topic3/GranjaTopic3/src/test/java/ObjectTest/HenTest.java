package ObjectTest;


import com.joanna.Items.Color;
import com.joanna.Objects.Egg;
import com.joanna.Objects.Hen;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class HenTest {
    private final static Logger log = Logger.getLogger(HenTest.class);

    Hen redHen = new Hen(Color.RED);
    Egg eggRed = new Egg(redHen.getEggsColor());
    Egg[] eggsRed = {eggRed, eggRed};


    Hen whiteHen = new Hen(Color.WHITE);
    Egg eggWhite = new Egg(whiteHen.getEggsColor());
    Egg[] eggsWhite = {eggWhite, eggWhite};

    @Test
    public void getEggsColorTest(){
        Assert.assertEquals(Color.RED, redHen.getEggsColor());
        Assert.assertEquals(Color.WHITE, whiteHen.getEggsColor());
        log.info("getEggsColorTest Passed");
    }

      @Test
    public void handEggTest(){
        redHen.layEggs();
        Assert.assertArrayEquals(eggsRed, redHen.handEgg());

        whiteHen.layEggs();
        Assert.assertArrayEquals(eggsWhite, whiteHen.handEgg());
          log.info("handEggTest Passed");
    }

    @Test
    public void getEggTest(){
        redHen.layEggs();
        Assert.assertArrayEquals(eggsRed, redHen.getEgg());
        log.info("getEggTest Passed");
    }

    @Test
    public void toStringTest() {
        Assert.assertEquals("egg colors: RED", redHen.toString());
        Assert.assertNotEquals("egg colors: WHITE", redHen.toString());
        Assert.assertNotNull(redHen.toString());
        log.info("toStringTest Passed");
    }

}
