package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private  static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    public static void main(String[] args) {

        /*
        * This Program enables the player to input commands on which direction they would like to go example W moves the player towards the west
        * Attempt to move in a restricted direction would print a message and remain in the current position
        * Only single letter commands are available example (E,W,N,S,Q)
        * Directions
        * W = West
        * E = East
        * S = South
        * N = North
        * Q = Quit*/

        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> tempExits = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "You're now learning Java Programming Language", tempExits));

        tempExits = new HashMap<String, Integer>();
        tempExits.put("W", 2);
        tempExits.put("E", 3);
        tempExits.put("S", 4);
        tempExits.put("N", 5);
        locations.put(1, new Location(1, "You're standing at the end of the road beside a brick wall", tempExits));

        tempExits = new HashMap<String, Integer>();
        tempExits.put("N", 5);
        locations.put(2, new Location(2, "You're at the top of a hill", tempExits));

        tempExits = new HashMap<String, Integer>();
        tempExits.put("W", 1);
        locations.put(3, new Location(3, "You're inside a building, a well house for a small spring", tempExits));

        tempExits = new HashMap<String, Integer>();
        tempExits.put("N", 1);
        tempExits.put("W", 2);
        locations.put(4, new Location(4, "You're in a valley beside a stream", tempExits));

        tempExits = new HashMap<String, Integer>();
        tempExits.put("S", 1);
        tempExits.put("W", 2);
        locations.put(5, new Location(5, "You're in the forest", tempExits));

        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("Quit", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");

        int loc = 1;
        while (true)
        {
            System.out.println(locations.get(loc).getDescription());
            tempExits.remove("S");

            if (loc == 0)
                break;
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are >>> ");
            for (String Exits: exits.keySet())
            {
                System.out.print( Exits + ", " );
            }
            System.out.println();
            System.out.print("Enter you current location ID: ");
            String direction = scanner.nextLine().toUpperCase();
            if  (exits.containsKey(direction))
            {
                loc = exits.get(direction);
            }
            else
                System.out.println("You cannot go there");
        }
    }
}
