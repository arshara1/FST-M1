package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main (String[] args)
    {
        HashSet<String> hs = new HashSet<String>();
        //Adding element to the HAsh set
        hs.add("M");
        hs.add("A") ;
        hs.add("C");
        hs.add("L");
        hs.add("B");
        hs.add("D");

        //Print Hashset
        System.out.println("Print  the Hashset: " +  hs);
        System.out.println("Size of the Hashset: " + hs.size());
        System.out.println("Removing an element: " + hs.remove("A"));
        if(hs.remove("Z")) {
            System.out.println(" Z is removed from the Hashset");
        }else {
            System.out.println(" Z is not present in the Hashset");
        }
        //Search for an element
        System.out.println("Checking if M is present in Set: " + hs.contains("M"));
        System.out.println("Updated Hashset: " + hs);

    }
}
