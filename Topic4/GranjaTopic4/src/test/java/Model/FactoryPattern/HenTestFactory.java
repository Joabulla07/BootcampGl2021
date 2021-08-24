package Model.FactoryPattern;

import com.joanna.constants.Color;
import com.joanna.Model.Hen;
import com.joanna.Model.FactoryPattern.FactoryHen;
import com.joanna.Model.BuilderPattern.HenBuilder;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;


public class HenTestFactory {

    private final static Logger log = Logger.getLogger(HenTestFactory.class);
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
