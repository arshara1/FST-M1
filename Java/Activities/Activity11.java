package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args){
        HashMap<Integer,String> hash_map = new HashMap<Integer,String>();
        hash_map.put(1,"Red");
        hash_map.put(2,"Green");
        hash_map.put(3,"Blue");
        hash_map.put(4,"yellow");
        hash_map.put(5,"Violet");

        //Print the map
        System.out.println("The Original map is " + hash_map);

        //Remove one from map
        System.out.println("Removing one from map " + hash_map.remove(2));

        //Checking Green is present in the map
        if(hash_map.containsValue("Green")) {
            System.out.println(" Green is present");
        }else {
            System.out.println("Green is not present");
        }
        //Printing the size of the map
        System.out.println("Size of the map: " + hash_map.size());
        }
    }

