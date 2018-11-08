import org.junit.Assert;
import org.junit.Test;

public class FiveMinutesRowTest {

    private FiveMinutesRow fiveMinutesRow = new FiveMinutesRow();

    @Test
    public void shouldReturnElevenO() {

        int minutes = 00;

        Assert.assertEquals("OOOOOOOOOOO", fiveMinutesRow.writeFiveMinutesRow(minutes));
    }

    @Test
    public void shouldReturnAllLampsLit() {

        int minutes = 59;

        Assert.assertEquals("YYRYYRYYRYY", fiveMinutesRow.writeFiveMinutesRow(minutes));
    }

    @Test
    public void shouldReturnElevenOAgain() {

        int minutes = 04;

        Assert.assertEquals("OOOOOOOOOOO", fiveMinutesRow.writeFiveMinutesRow(minutes));
    }

    @Test
    public void shouldReturnFourLampsLit() {

        int minutes = 23;

        Assert.assertEquals("YYRYOOOOOOO", fiveMinutesRow.writeFiveMinutesRow(minutes));
    }

    @Test
    public void shouldReturnSevenLampsLit() {

        int minutes = 35;

        Assert.assertEquals("YYRYYRYOOOO", fiveMinutesRow.writeFiveMinutesRow(minutes));
    }

}