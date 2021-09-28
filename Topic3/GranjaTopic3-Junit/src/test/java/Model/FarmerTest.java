package Model;

import Model.FactoryPattern.FactoryHenTest;
import com.joanna.Enums.Color;
import com.joanna.Model.EggsCarton;
import com.joanna.Model.Farmer;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;


public class FarmerTest {
    private final static Logger log = Logger.getLogger(FactoryHenTest.class);
    Farmer farmer = Farmer.getInstance();
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
