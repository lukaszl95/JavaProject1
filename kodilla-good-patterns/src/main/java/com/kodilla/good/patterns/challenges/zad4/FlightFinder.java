package com.kodilla.good.patterns.challenges.zad4;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder {

    private Set<Flight> connections;

    public FlightFinder(Set<Flight> connections) {
        this.connections = connections;
    }

    public String findFlightWithChange(String departure, String arrival) {
        String change = connections.stream()
                .filter(entry -> entry.getDeparture().equals(departure))
                .map(Flight::getArrival)
                .collect(Collectors.joining(", "));

        String fly = connections.stream()
                .filter(entry -> entry.getDeparture().equals(change) && entry.getArrival().equals(arrival))
                .map(Flight::getArrival)
                .collect(Collectors.joining(", "));
        if (fly.equals(arrival)) {
            return "You can fly to " + arrival + " from " + departure + " via " + change;
        } else {
            return "No connecting flight";
        }

    }

}
