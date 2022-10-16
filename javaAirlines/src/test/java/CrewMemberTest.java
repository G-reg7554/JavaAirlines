import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrewMemberTest {

CrewMember crewMember, crewMember1;
    @Before
    public void setUp(){
        crewMember = new CrewMember("Joanne", RankType.LEADATTENDANT);
        crewMember1 = new CrewMember("Susan", RankType.FLIGHTATTENDANT);
    }

    @Test
    public void hasCrewNameTest(){
        assertEquals("Joanne", crewMember.getName());
    }

    @Test
    public void hasCrewRankTest(){
        assertEquals(RankType.LEADATTENDANT, crewMember.getRank());
    }

    @Test
    public void hasCrewRankTest1(){
        assertEquals(RankType.FLIGHTATTENDANT, crewMember1.getRank());
    }

    @Test
    public void crewMessageTest(){
        assertEquals("Slight turbulance please put seatbelts on", crewMember.crewMessage());
    }

    @Test public void enumHasStringLeadAttendant(){
        assertEquals("Lead Attendant", crewMember.getValueFromEnum());
    }

    @Test public void getRankNoTest(){
        assertEquals(3, crewMember.getRankNo());
    }

}
