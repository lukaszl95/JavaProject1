package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> lotniska = new HashMap<>();
        lotniska.put("Warszawa", true);
        lotniska.put("Wrocław", false);
        lotniska.put("Radom", true);

        if (lotniska.containsKey(flight.getArrivalAirport()) &&
                lotniska.containsKey(flight.getDepartureAirport()) &&
                lotniska.get(flight.getArrivalAirport()) &&
                lotniska.get(flight.getDepartureAirport())) {
            System.out.println("Fine!");
        } else {
            throw new RouteNotFoundException();
        }
    }


}