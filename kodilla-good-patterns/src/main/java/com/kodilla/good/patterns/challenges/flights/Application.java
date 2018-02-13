package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {
        //all flights from one city
        System.out.println(FlightSearch.travelFromOneCity(City.WARSZAWA));
        //all flights to one city
        System.out.println(FlightSearch.travelToOneCity(City.KRAKÓW));
        //all flights from one city to one city and one another city
        System.out.println(FlightSearch.travelFromOneCityToOneCityWithIndirectCity(City.WARSZAWA, City.LUBLIN, City.KRAKÓW));
    }

}
