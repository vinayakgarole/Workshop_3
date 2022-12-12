package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class HotelTest {

    HotelReservation HR = new HotelReservation();
    ArrayList<Hotel> hotelList = new ArrayList<>();

    Hotel hotel1 = new Hotel("Lackwood", 100);
    Hotel hotel2 = new Hotel("Bridgewood", 160);
    Hotel hotel3 = new Hotel("Ridgewood", 220);

    @Test
    public void addhotel(Assertions Assert) {
        boolean Welcome = HR.printWelcome();
        hotelList.add(hotel1);
        hotelList.add(hotel2);
        hotelList.add(hotel3);
        Assert.assertEquals(true, Welcome);
    }

}