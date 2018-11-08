import org.junit.Assert;
import org.junit.Test;

public class SingleMinutesRowTest {

    private SingleMinutesRow singleMinutesRow = new SingleMinutesRow();

    @Test
    public void shouldReturnFourO() {

        int minutes = 00;

        Assert.assertEquals("OOOO", singleMinutesRow.writeSingleMinutesRow(minutes));
    }

    @Test
    public void shouldReturnFourY() {

        int minutes = 59;

        Assert.assertEquals("YYYY", singleMinutesRow.writeSingleMinutesRow(minutes));
    }

    @Test
    public void shouldReturnTwoYTwoO() {

        int minutes = 32;

        Assert.assertEquals("YYOO", singleMinutesRow.writeSingleMinutesRow(minutes));
    }

    @Test
    public void shouldReturnFourYAgain() {

        int minutes = 34;

        Assert.assertEquals("YYYY", singleMinutesRow.writeSingleMinutesRow(minutes));
    }

    @Test
    public void shouldReturnFourOAgain() {

        int minutes = 35;

        Assert.assertEquals("OOOO", singleMinutesRow.writeSingleMinutesRow(minutes));
    }
}