package Model;

import com.joanna.Enums.Color;
import com.joanna.Model.Egg;
import com.joanna.Model.EggsCarton;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class EggsCartonTest {
    private final static Logger log = Logger.getLogger(EggsCartonTest.class);
    EggsCarton eggsCarton = new EggsCarton(Color.RED);
    EggsCarton eggsCartonWhite = new EggsCarton(Color.WHITE);
    EggsCarton eggsCartonRedHalf = new EggsCarton(Color.RED);

    @Test
    public void isFullTest() {
        Assert.assertEquals(false, eggsCarton.isFull());
        log.info("isFullTest Passed");
    }

    @Test
    public void getColorTest() {
        Assert.assertEquals(Color.RED, eggsCarton.getColor());
        Assert.assertNotEquals(Color.WHITE, eggsCarton.getColor());
        Assert.assertNotNull(eggsCarton.getColor());
        log.info("getColorTest Passed");
    }

    @Test
    public void addEggTest(){
        eggsCartonWhite.addEgg(new Egg(Color.WHITE));
        eggsCarton.addEgg(new Egg(Color.RED));
        Assert.assertNotNull(eggsCartonWhite);
        Assert.assertNotNull(eggsCarton);
        Assert.assertNotEquals(eggsCartonWhite, eggsCarton);
        log.info("addEggTest Passed");
    }

    @Test
    public void equalsTest() {
        Assert.assertEquals(eggsCartonRedHalf, eggsCarton);
        Assert.assertEquals(eggsCarton, eggsCarton);
        Assert.assertNotEquals(eggsCarton, eggsCartonWhite);
        Assert.assertNotNull(eggsCarton);
        log.info("equalsTest Passed");
    }
}
