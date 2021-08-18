package ObjectTest;

import com.joanna.Items.Color;
import com.joanna.Objects.EggsCarton;
import com.joanna.Objects.Farmer;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FarmerTest {

    Farmer farmer = Farmer.getInstance();
    EggsCarton[] eggsCartons = new EggsCarton[3];


    @Test
    public void getEggsCartonsTest(){
        Assert.assertNotEquals(eggsCartons, farmer.getEggsCartons());
        this.eggsCartons[0] = new EggsCarton(Color.RED);
        this.eggsCartons[1] = new EggsCarton(Color.RED);
        this.eggsCartons[2] = new EggsCarton(Color.WHITE);
        Assert.assertArrayEquals(eggsCartons, farmer.getEggsCartons());
    }

}
