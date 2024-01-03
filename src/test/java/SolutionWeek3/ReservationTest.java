package SolutionWeek3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {
    @Test
    void testTicket(){

        Reservation tres = new Reservation(3245);
        tres.showTicket();
//        assertEquals(3245, tres.showTicket());
        assertTrue(tres.showTicket()==3245);
    }

}