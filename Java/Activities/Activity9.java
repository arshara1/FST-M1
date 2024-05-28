package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args){
        //declaring ArrayList of String objects
        ArrayList<String> mylist = new ArrayList<>();
        mylist.add("Mango");
        mylist.add("Apple");
        mylist.add("Guava");
        //Adding objects at specific index
        mylist.add(3,"Orange");
        mylist.add(1,"Banana");

        //Print all objects
        System.out.println("Print all the objects");
        for(String s:mylist){
            System.out.println(s);
        }
        System.out.println("3rd onject in the list: " + mylist.get(2));
        System.out.println("Is Apple present in the list: " + mylist.contains("Apple"));
        System.out.println("Size of the ArrayList " + mylist.size());

        mylist.remove("Orange");

        //new Size of the Array list

        System.out.println("New size of the ArrayList " + mylist.size());
    }
}
