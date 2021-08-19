package Model.BuilderPattern;

import Model.FactoryPattern.FactoryHenTest;
import com.joanna.Enums.Color;
import com.joanna.Model.Hen;
import com.joanna.Model.BuilderPattern.HenBuilder;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class HenBuilderTest {
    private final static Logger log = Logger.getLogger(FactoryHenTest.class);
    Hen redHen = new Hen(Color.RED);
    HenBuilder henBuild = new HenBuilder();

    @Test
    public void buildTest(){
        Assert.assertEquals(redHen, henBuild.color(Color.RED).build());
        log.info("buildTest Passed");
    }
}
