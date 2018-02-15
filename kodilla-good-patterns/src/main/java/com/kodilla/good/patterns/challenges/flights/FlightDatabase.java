package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightDatabase {
    private static Set<Flight> flightSet = new HashSet<>();

    public static Set<Flight> getFlightSet() {
<<<<<<< HEAD
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
=======
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
>>>>>>> b259f057abfdffe6d847499202c3c0a8a504c51a

        return flightSet;
    }
}
