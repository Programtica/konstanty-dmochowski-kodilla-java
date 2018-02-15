package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {
        System.out.println(FlightsSearch.flightsFromDepartureCity(City.WARSZAWA));
        System.out.println(FlightsSearch.flightsToArrivalCity(City.KRAKÓW));
        System.out.println(FlightsSearch.checkFlightWithIndirectCity(City.WARSZAWA, City.LUBLIN, City.KRAKÓW));
    }
}
