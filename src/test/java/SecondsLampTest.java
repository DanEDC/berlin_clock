import org.junit.Assert;
import org.junit.Test;

public class SecondsLampTest {

    private SecondsLamp secondsLamp = new SecondsLamp();

    @Test
    public void shouldReturnY() {

        int seconds = 00;

        Assert.assertEquals("Y", secondsLamp.writeSecondsLamp(seconds));
    }

    @Test
    public void shouldReturnO() {

        int seconds = 59;

        Assert.assertEquals("O", secondsLamp.writeSecondsLamp(seconds));
    }

}