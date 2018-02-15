package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightDatabase {
    private static Set<Flight> flightSet = new HashSet<>();

    public static Set<Flight> getFlightSet() {
        flightSet.add(new Flight(City.POZNAŃ, City.WARSZAWA));
        flightSet.add(new Flight(City.WARSZAWA, City.GDAŃSK));
        flightSet.add(new Flight(City.WARSZAWA, City.WROCŁAW));
        flightSet.add(new Flight(City.WARSZAWA, City.KRAKÓW));
        flightSet.add(new Flight(City.WARSZAWA, City.POZNAŃ));
        flightSet.add(new Flight(City.WARSZAWA, City.LUBLIN));
        flightSet.add(new Flight(City.POZNAŃ, City.KRAKÓW));
        flightSet.add(new Flight(City.POZNAŃ, City.GDAŃSK));
        flightSet.add(new Flight(City.KRAKÓW, City.WROCŁAW));
        flightSet.add(new Flight(City.LUBLIN, City.KRAKÓW));
        flightSet.add(new Flight(City.LUBLIN, City.WROCŁAW));
        flightSet.add(new Flight(City.GDAŃSK, City.WROCŁAW));

        return flightSet;
    }
}
