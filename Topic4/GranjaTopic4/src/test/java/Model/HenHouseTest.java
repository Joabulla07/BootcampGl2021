package Model;

import Model.FactoryPattern.HenTestFactory;
import com.joanna.Model.HenHouse;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class HenHouseTest {
    private final static Logger log = Logger.getLogger(HenTestFactory.class);
    HenHouse henHouse = new HenHouse();

    @Test
    public void getHens(){
        henHouse.initHenHouse();
        Assert.assertNotNull(henHouse.getHens());
        Assert.assertEquals(40, henHouse.getHenCount());
        Assert.assertEquals(12, henHouse.getHenWhiteCount());
        Assert.assertEquals(28, henHouse.getHenRedCount());
        log.info("getHens Passed");
    }
}
