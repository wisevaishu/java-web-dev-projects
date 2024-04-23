package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class start {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        Comparator comparator = new FlavorComparator();
        Comparator cone = new ConeComparator();

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the
        //  'cost' field.


        flavors.sort(comparator);


        cones.sort(cone);

        //flavors.sort(new FlavorComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the
        //  sorting.
    }
}