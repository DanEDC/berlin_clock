import org.junit.Assert;
import org.junit.Test;

public class SingleHoursRowTest {

    private SingleHoursRow singleHoursRow = new SingleHoursRow();

    @Test
    public void shouldReturnFourO() {

        int hours = 00;

        Assert.assertEquals("OOOO", singleHoursRow.writeSingleHoursRow(hours));
    }

    @Test
    public void shouldReturnThreeR() {

        int hours = 23;

        Assert.assertEquals("RRRO", singleHoursRow.writeSingleHoursRow(hours));
    }

    @Test
    public void shouldReturnTwoR() {

        int hours = 02;

        Assert.assertEquals("RROO", singleHoursRow.writeSingleHoursRow(hours));
    }

    @Test
    public void shouldReturnThreeRAgain() {

        int hours = 8;

        Assert.assertEquals("RRRO", singleHoursRow.writeSingleHoursRow(hours));
    }

    @Test
    public void shouldReturnFourR() {

        int hours = 14;

        Assert.assertEquals("RRRR", singleHoursRow.writeSingleHoursRow(hours));
    }

}