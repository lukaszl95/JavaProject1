package com.kodilla.exception.test;

public class FlightRunner {

    public static void main (String[] args) {

        Flight radom = new Flight("Warszawa", "Radom");
        FlightFinder radomFind = new FlightFinder();
        try {
            radomFind.findFlight(radom);
        } catch (RouteNotFoundException r) {
            System.out.println("Sorry!");
        } finally {
            System.out.println("End!");
        }


        Flight warszawa = new Flight("Wrocław", "Warszawa");
        FlightFinder warszawaFind = new FlightFinder();
        try {
            warszawaFind.findFlight(warszawa);
        } catch (RouteNotFoundException r) {
            System.out.println("Sorry!");
        } finally {
            System.out.println("End!");
        }


        Flight gdansk = new Flight("Warszawa", "Gdańsk");
        FlightFinder gdanskFind = new FlightFinder();
        try {
            gdanskFind.findFlight(gdansk);
        } catch (RouteNotFoundException r) {
            System.out.println("Sorry!");
        } finally {
            System.out.println("End!");
        }
    }
}