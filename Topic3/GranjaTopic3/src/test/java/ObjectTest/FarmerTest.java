package ObjectTest;

import PatternsTest.FactoryHenTest;
import com.joanna.Items.Color;
import com.joanna.Objects.EggsCarton;
import com.joanna.Objects.Farmer;
import com.joanna.Objects.Hen;
import com.joanna.Objects.HenHouse;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FarmerTest {
    private final static Logger log = Logger.getLogger(FactoryHenTest.class);
    Farmer farmer = Farmer.getInstance();
    HenHouse henHouse = HenHouse.getInstance();
    EggsCarton[] eggsCartons = new EggsCarton[3];


    @Test
    public void getEggsCartonsTest(){
        Assert.assertNotEquals(eggsCartons, farmer.getEggsCartons());
        this.eggsCartons[0] = new EggsCarton(Color.RED);
        this.eggsCartons[1] = new EggsCarton(Color.RED);
        this.eggsCartons[2] = new EggsCarton(Color.WHITE);
        Assert.assertArrayEquals(eggsCartons, farmer.getEggsCartons());
        log.info("getEggsCartonsTest Passed");
    }

}
