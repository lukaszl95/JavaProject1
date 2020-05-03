package com.kodilla.good.patterns.challenges.zad4;

public class Application {

    public static void main (String[] args) {

        FlightRepository flightRepository = new FlightRepository();

        FlightFinder flightFinder = new FlightFinder(flightRepository.create());

        System.out.println(flightFinder.findFlightWithChange("Warsaw","Bialystok"));

        // "Warsaw","Wroclaw"
        // "Wroclaw", "Radom"
        // "Wroclaw", "Bialystok"
        // "Gdansk","Radom"
    }
}
