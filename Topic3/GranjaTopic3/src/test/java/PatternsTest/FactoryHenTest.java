package PatternsTest;

import com.joanna.Items.Color;
import com.joanna.Main;
import com.joanna.Objects.Hen;
import com.joanna.Patterns.FactoryHen;
import com.joanna.Patterns.HenBuilder;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;


public class FactoryHenTest {

    private final static Logger log = Logger.getLogger(FactoryHenTest.class);
    Hen henWhite = new HenBuilder().color(Color.WHITE).build();
    Hen henRed = new HenBuilder().color(Color.RED).build();
    FactoryHen factoryH = new FactoryHen();

    @Test
    public void factoryHenTest(){
        Assert.assertEquals(henWhite, factoryH.factoryHen(Color.WHITE));
        Assert.assertEquals(henRed, factoryH.factoryHen(Color.RED));
        log.info("factoryHenTest Passed");
    }
}
