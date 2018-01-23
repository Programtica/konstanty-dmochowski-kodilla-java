package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent
{
    private final String nameOfContinent;
    private Set<Country> countries = new HashSet<>();

    public Continent(String nameOfContinent)
    {
        this.nameOfContinent = nameOfContinent;
    }

    public void addCountry(Country country)
    {
        countries.add(country);
    }

    public Set<Country> getCountries()
    {
        return countries;
    }

    @Override
    public String toString()
    {
        return "Continent{" +
                "nameOfContinent='" + nameOfContinent + '\'' +
                ", countries=" + countries +
                '}';
    }
}
