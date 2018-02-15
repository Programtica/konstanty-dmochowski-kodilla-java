package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightDatabase {
    private static Set<Flight> flightSet = new HashSet<>();

    public static Set<Flight> getFlightSet() {
        flightSet.add(new Flight(City.POZNAN, City.WARSZAWA));
        flightSet.add(new Flight(City.WARSZAWA, City.GDANSK));
        flightSet.add(new Flight(City.WARSZAWA, City.WROCLAW));
        flightSet.add(new Flight(City.WARSZAWA, City.KRAKOW));
        flightSet.add(new Flight(City.WARSZAWA, City.POZNAN));
        flightSet.add(new Flight(City.WARSZAWA, City.LUBLIN));
        flightSet.add(new Flight(City.POZNAN, City.KRAKOW));
        flightSet.add(new Flight(City.POZNAN, City.GDANSK));
        flightSet.add(new Flight(City.KRAKOW, City.WROCLAW));
        flightSet.add(new Flight(City.LUBLIN, City.KRAKOW));
        flightSet.add(new Flight(City.LUBLIN, City.WROCLAW));
        flightSet.add(new Flight(City.GDANSK, City.WROCLAW));

        return flightSet;
    }
}
