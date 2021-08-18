package ObjectTest;

import com.joanna.Items.Color;
import com.joanna.Objects.Egg;
import org.junit.Assert;
import org.junit.Test;

public class EggTest {

    Egg redEgg = new Egg(Color.RED);
    Egg whiteEgg = new Egg(Color.WHITE);
    Egg nullEgg = new Egg(null);

    @Test
    public void getColorTest(){
        Assert.assertEquals(Color.RED, redEgg.getColor());
        Assert.assertEquals(Color.WHITE, whiteEgg.getColor());
        Assert.assertNull(nullEgg.getColor());
    }

    @Test
    public void to_string() {
        Assert.assertEquals("(D)", redEgg.toString());
        Assert.assertEquals("(O)", whiteEgg.toString());
        Assert.assertEquals("(G)", nullEgg.toString());
    }

    @Test
    public void equals(){
        Assert.assertNotEquals(redEgg, whiteEgg);
    }
}
