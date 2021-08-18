package ObjectTest;

import PatternsTest.FactoryHenTest;
import com.joanna.Objects.Hen;
import com.joanna.Objects.HenHouse;
import com.joanna.Patterns.FactoryHen;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class HenHouseTest {
    private final static Logger log = Logger.getLogger(FactoryHenTest.class);
    HenHouse henHouse = HenHouse.getInstance();

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
