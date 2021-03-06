package com.kodilla.good.patterns.challenges.flights;

public class Flight {
    private City departureCity;
    private City arrivalCity;

    public Flight(City departureCity, City arrivalCity) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }

    public City getDepartureCity() {
        return departureCity;
    }

    public City getArrivalCity() {
        return arrivalCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof City) return true;
        if ((o instanceof Flight) == false) return false;
        Flight flight = (Flight) o;

        if(!(departureCity.equals(flight.departureCity))) {
            return false;
        }

        return arrivalCity.equals(flight.arrivalCity);
    }

    @Override
    public int hashCode() {
        int result = departureCity.hashCode();
        result = 31 * result + arrivalCity.hashCode();
        return result;

    }

    @Override
    public String toString() {
        return departureCity + " -> " + arrivalCity;
    }
}
