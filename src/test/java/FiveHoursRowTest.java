import org.junit.Assert;
import org.junit.Test;

public class FiveHoursRowTest {

    private FiveHoursRow fiveHoursRow = new FiveHoursRow();

    @Test
    public void shouldReturnFourO() {

        int hours = 00;

        Assert.assertEquals("OOOO", fiveHoursRow.writeFiveHoursRow(hours));
    }

    @Test
    public void shouldReturnFourR() {

        int hours = 23;

        Assert.assertEquals("RRRR", fiveHoursRow.writeFiveHoursRow(hours));
    }

    @Test
    public void shouldReturnFourOAgain() {

        int hours = 02;

        Assert.assertEquals("OOOO", fiveHoursRow.writeFiveHoursRow(hours));
    }

    @Test
    public void shouldReturnOneR() {

        int hours = 8;

        Assert.assertEquals("ROOO", fiveHoursRow.writeFiveHoursRow(hours));
    }

    @Test
    public void shouldReturnThreeR() {

        int hours = 16;

        Assert.assertEquals("RRRO", fiveHoursRow.writeFiveHoursRow(hours));
    }

}