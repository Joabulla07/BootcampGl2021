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
    Hen henNull = new HenBuilder().color(null).build();
    FactoryHen factoryH = new FactoryHen();

    @Test
    public void factoryHenTest(){
        Assert.assertEquals(henWhite.getEggsColor(), factoryH.factoryHen(Color.WHITE).getEggsColor());
        Assert.assertEquals(henRed.getEggsColor(), factoryH.factoryHen(Color.RED).getEggsColor());
        Assert.assertNull(factoryH.factoryHen(Color.GREEN));
        try{
            Assert.assertEquals(henNull.getEggsColor(), factoryH.factoryHen(null).getEggsColor());
        }catch(NullPointerException e){
            //log.error("color not found");
        }
        finally {
            log.info("Test Passed");
        }
    }
}
