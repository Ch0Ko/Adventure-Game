package com.company;

import java.util.HashMap;
import java.util.Map;

/*Immutable Classes
*Creating a location Game Class
* Objects can go in different directions as long as there's a path to move along
* */
public final class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    //Constructor Used to create objects of this class
    Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if (exits != null)
            this.exits = new HashMap<String, Integer>(exits);
        else
            this.exits = new HashMap<>();
        this.exits.put("Q", 0);
    }

    //Function for getting current Location
    public int getLocationID() {
        return locationID;
    }

    //Function for Location Description
    public String getDescription() {
        return description;
    }

    //Function returns Available exits for a particular location
    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }

    //Returns String format for each object created
    @Override
    public String toString() {
        return "Current Location ->>" + '\n' +
                "locationID=" + locationID + '\n' +
                "Description=" + description + '\n' +
                "Exits=" + exits;
    }
}
