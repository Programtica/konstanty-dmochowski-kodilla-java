package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {
        System.out.println(FlightSearch.travelFromOneCity(City.WARSZAWA));
        System.out.println(FlightSearch.travelToOneCity(City.KRAKOW));
        System.out.println(FlightSearch.travelFromOneCityToOneCityWithIndirectCity(City.WARSZAWA, City.LUBLIN, City.KRAKOW));
    }
}
