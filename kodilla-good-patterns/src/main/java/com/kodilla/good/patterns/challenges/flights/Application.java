package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {
<<<<<<< HEAD
        System.out.println(FlightsSearch.flightsFromDepartureCity(City.WARSZAWA));
        System.out.println(FlightsSearch.flightsToArrivalCity(City.KRAKÓW));
        System.out.println(FlightsSearch.checkFlightWithIndirectCity(City.WARSZAWA, City.LUBLIN, City.KRAKÓW));
=======
        System.out.println(FlightSearch.travelFromOneCity(City.WARSZAWA));
        System.out.println(FlightSearch.travelToOneCity(City.KRAKOW));
        System.out.println(FlightSearch.travelFromOneCityToOneCityWithIndirectCity(City.WARSZAWA, City.LUBLIN, City.KRAKOW));
>>>>>>> b259f057abfdffe6d847499202c3c0a8a504c51a
    }
}
