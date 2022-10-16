import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;
     RankType rankType;

    @Before
    public void setUp(){
        pilot = new Pilot("Josh","67 789", rankType.CAPTAIN);
    }

    @Test
    public void hasNameTest(){
        assertEquals("Josh", pilot.getName());
    }

    @Test
    public void getLicenseNumberTest(){
        assertEquals("67 789", pilot.getLicenseNumber());
    }

    @Test
    public void getRankTest(){
        assertEquals(RankType.CAPTAIN, pilot.getRank());
    }

    @Test
    public void flyPlaneTest(){
        assertEquals("The Plane Is Now flying!", pilot.flyPlane());
    }
}