package com.kodilla.exception.test;

import java.util.HashMap;

public class FindFlightRunner
{
    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> listOfAiports = new HashMap<String, Boolean>();

        listOfAiports.put("Poznan", true);
        listOfAiports.put("Warsaw", true);
        listOfAiports.put("London", true);
        listOfAiports.put("Milano", false);
        listOfAiports.put("New York", false);
        listOfAiports.put("Frankfurt am Main", true);

        if(listOfAiports.containsKey(flight.getDepartureAirport()) == true && listOfAiports.containsKey(flight.getArrivalAirport()) == true) {
            System.out.println("Yes, this flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " was found!");
        }

        else {
            throw new RouteNotFoundException("Sorry. We did not find our aiports or flights in our base!");
        }
    }

    public static void main(String[] args) {
        Flight flight = new Flight("Poznan", "London");
        FindFlightRunner find = new FindFlightRunner();

        try {
            find.findFlight(flight);
        }

        catch(RouteNotFoundException e) {
            System.out.println("Terrible news... we haven't this flight in our base!"
                    + " Please, try another flight.");
        }

        finally {
            System.out.println("It's everything for today!");
        }
    }
}
