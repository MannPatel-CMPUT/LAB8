package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

//THIS CLASS REPRESENTS THE LIST
public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    public void Delete_city(City city){
            cities.remove(city);
    }

    public int Count_City(){
        return cities.size();
    }

    

    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }

}
