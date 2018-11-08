import org.junit.Assert;
import org.junit.Test;

public class EntireBerlinClockTest {

    private EntireBerlinClock entireBerlinClock = new EntireBerlinClock();

    @Test
    public void shouldReturnBerlinClockOutputNo1() {

        int hours = 00;
        int minutes = 00;
        int seconds = 00;

        Assert.assertEquals("YOOOOOOOOOOOOOOOOOOOOOOO", entireBerlinClock.writeBerlinClock(hours, minutes, seconds));
    }

    @Test
    public void shouldReturnBerlinClockOutputNo2() {

        int hours = 23;
        int minutes = 59;
        int seconds = 59;

        Assert.assertEquals("ORRRRRRROYYRYYRYYRYYYYYY", entireBerlinClock.writeBerlinClock(hours, minutes, seconds));
    }

    @Test
    public void shouldReturnBerlinClockOutputNo3() {

        int hours = 16;
        int minutes = 50;
        int seconds = 06;

        Assert.assertEquals("YRRROROOOYYRYYRYYRYOOOOO", entireBerlinClock.writeBerlinClock(hours, minutes, seconds));
    }

    @Test
    public void shouldReturnBerlinClockOutputNo4() {

        int hours = 11;
        int minutes = 37;
        int seconds = 01;

        Assert.assertEquals("ORROOROOOYYRYYRYOOOOYYOO", entireBerlinClock.writeBerlinClock(hours, minutes, seconds));
    }

}