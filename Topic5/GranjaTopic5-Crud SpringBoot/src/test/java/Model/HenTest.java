package Model;


import com.joanna.constants.Color;
import com.joanna.Model.Egg;
import com.joanna.Model.Hen;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


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
        Hen redHen1 = Mockito.mock(Hen.class);
        Mockito.when(redHen1.getEggsColor()).thenReturn(Color.RED);

        Hen whiteHen1 = Mockito.mock(Hen.class);
        Mockito.when(whiteHen1.getEggsColor()).thenReturn(Color.WHITE);

        Assert.assertEquals(redHen1.getEggsColor(), redHen.getEggsColor());
        Assert.assertEquals(whiteHen1.getEggsColor(), whiteHen.getEggsColor());
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
        Assert.assertArrayEquals(eggsRed, redHen.getEggs());
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
